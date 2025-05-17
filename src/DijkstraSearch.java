import java.util.*;

public class DijkstraSearch<V> extends Search<V> {

    private final Map<V, Double> dist = new HashMap<>();
    private final WeightedGraph<V> graph;

    public DijkstraSearch(WeightedGraph<V> graph, V source) {
        super(source);
        this.graph = graph;
        dijkstra();
    }

    private void dijkstra() {
        PriorityQueue<V> pq = new PriorityQueue<>(Comparator.comparingDouble(dist::get));
        dist.put(source, 0.0);
        pq.add(source);

        while (!pq.isEmpty()) {
            V v = pq.poll();
            if (!marked.add(v)) continue;  // already finalised

            for (V neighbour : graph.adjacencyList(v)) {
                double newDist = dist.get(v) + graph.getWeight(v, neighbour);
                if (newDist < dist.getOrDefault(neighbour, Double.MAX_VALUE)) {
                    dist.put(neighbour, newDist);
                    edgeTo.put(neighbour, v);
                    pq.remove(neighbour);
                    pq.add(neighbour);
                }
            }
        }
    }
}
