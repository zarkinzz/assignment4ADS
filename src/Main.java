public class Main {

    public static void main(String[] args) {
        WeightedGraph<String> g = new WeightedGraph<>(true);
        seed(g);

        System.out.println("Shortest path by Dijkstra:");
        Search<String> dj = new DijkstraSearch<>(g, "Almaty");
        printPath(dj, "Kyzylorda");

        System.out.println("\nPath produced by plain BFS (ignores weights):");
        Search<String> bfs = new BreadthFirstSearch<>(g, "Almaty");
        printPath(bfs, "Kyzylorda");
    }

    private static void seed(WeightedGraph<String> g) {
        g.addEdge("Almaty",   "Astana",    2.1);
        g.addEdge("Shymkent", "Atyrau",    7.8);
        g.addEdge("Atyrau",   "Astana",    7.1);
        g.addEdge("Almaty",   "Shymkent",  7.2);
        g.addEdge("Shymkent", "Astana",    3.9);
        g.addEdge("Astana",   "Kostanay",  3.5);
        g.addEdge("Shymkent", "Kyzylorda", 5.4);
    }

    private static void printPath(Search<String> search, String dest) {
        Iterable<String> path = search.pathTo(dest);
        if (path == null) {
            System.out.println("no path");
            return;
        }
        path.forEach(v -> System.out.print(v + " -> "));
        System.out.println("END");
    }
}
