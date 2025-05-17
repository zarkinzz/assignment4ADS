import java.util.*;

public abstract class Search<V> {
    protected final V source;
    protected final Set<V> marked = new HashSet<>();
    protected final Map<V, V> edgeTo = new HashMap<>();

    protected Search(V source) {
        this.source = source;
    }

    public boolean hasPathTo(V v) {
        return marked.contains(v);
    }

    public Iterable<V> pathTo(V v) {
        if (!hasPathTo(v)) return null;

        LinkedList<V> path = new LinkedList<>();
        for (V x = v; !x.equals(source); x = edgeTo.get(x)) {
            path.push(x);
        }
        path.push(source);
        return path;
    }
}
