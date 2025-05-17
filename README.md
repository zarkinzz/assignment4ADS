## 📌 Graph Demo — "Vertex as an Object"

This Java project demonstrates how to implement a **weighted graph**, where each **vertex** maintains its own **list of neighbors** along with the **edge weights**. The demo includes implementations of **Breadth-First Search (BFS)** and **Dijkstra’s shortest path algorithm**.

### 🗂 File Structure

| File                      | Description                                                                                  |
| ------------------------- | -------------------------------------------------------------------------------------------- |
| `Vertex.java`             | Represents a graph vertex with its data and a `Map` of connected neighbors and edge weights. |
| `WeightedGraph.java`      | Manages the graph structure: adding vertices and edges, querying neighbors and weights.      |
| `Search.java`             | Abstract base class for search algorithms (tracks visited nodes and paths).                  |
| `BreadthFirstSearch.java` | BFS implementation (does not consider edge weights).                                         |
| `DijkstraSearch.java`     | Dijkstra's algorithm for finding shortest paths with non-negative weights.                   |
| `Main.java`               | Small demo showcasing the graph with cities in Kazakhstan.                                   |

### ▶️ How to Run

```bash
javac *.java     # Compile all files
java Main        # Run the demo
```
