# Graph Demo — “Vertex as an Object”

A small Java project that shows how to build a **weighted graph where
each vertex keeps its own list of neighbours and edge weights**.
Includes Breadth-First Search (BFS) and Dijkstra’s shortest-path
algorithm.

## File overview

| File                       | Purpose                                                  |
|----------------------------|----------------------------------------------------------|
| `Vertex.java`              | A vertex holding its payload + `Map` of neighbours → weight |
| `WeightedGraph.java`       | Graph container: add vertices/edges, query neighbours, get weight |
| `Search.java`              | Abstract base for searches (marking, path reconstruction) |
| `BreadthFirstSearch.java`  | BFS implementation (ignores weights)                     |
| `DijkstraSearch.java`      | Dijkstra’s algorithm for non-negative edge weights       |
| `Main.java`                | Tiny demo with Kazakhstani cities                        |

## Quick start

```bash
javac *.java    # compile
java Main       # run demo
