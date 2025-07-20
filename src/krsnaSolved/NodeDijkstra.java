package krsnaSolved;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import java.util.*;
import java.util.stream.Stream;

@Getter
@Setter
@RequiredArgsConstructor
public class NodeDijkstra implements Comparable<NodeDijkstra> {
    private final String name;
    private Integer distance = Integer.MAX_VALUE;
    private List<NodeDijkstra> shortestPath = new LinkedList<>();
    private Map<NodeDijkstra, Integer> adjacentNodes = new HashMap<>();
    public void addAdjacentNode(NodeDijkstra node, int weight) {
        adjacentNodes.put(node, weight);
    }

    @Override
    public int compareTo(NodeDijkstra node) {
        return Integer.compare(this.distance, node.getDistance());
    }

    // Dijkstra's algorithm implementation
    public static void calculateShortestPath(NodeDijkstra source) {
        source.setDistance(0);
        Set<NodeDijkstra> settledNodes = new HashSet<>();
        Queue<NodeDijkstra> unsettledNodes = new PriorityQueue<>(Collections.singleton(source));
        while (!unsettledNodes.isEmpty()) {
            NodeDijkstra currentNode = unsettledNodes.poll();
            currentNode.getAdjacentNodes()
                    .entrySet()
                    .stream()
                    .filter(entry -> !settledNodes.contains(entry.getKey()))
                    .forEach(entry -> {
                        evaluateDistanceAndPath(entry.getKey(), entry.getValue(), currentNode);
                        unsettledNodes.add(entry.getKey());
                    });
            settledNodes.add(currentNode);
        }
    }

    private static void evaluateDistanceAndPath(NodeDijkstra adjacentNode, Integer edgeWeight, NodeDijkstra sourceNode) {
        Integer newDistance = sourceNode.getDistance() + edgeWeight;

        if (newDistance < adjacentNode.getDistance()) {
            adjacentNode.setDistance(newDistance);
            adjacentNode.setShortestPath(
                    Stream.concat(
                            sourceNode.getShortestPath().stream(),
                            Stream.of(sourceNode)
                    ).toList()
            );
        }
    }

    public static void main(String[] args) {
        NodeDijkstra nodeA = new NodeDijkstra("A");
        NodeDijkstra nodeB = new NodeDijkstra("B");
        NodeDijkstra nodeC = new NodeDijkstra("C");
        NodeDijkstra nodeD = new NodeDijkstra("D");
        NodeDijkstra nodeE = new NodeDijkstra("E");
        NodeDijkstra nodeF = new NodeDijkstra("F");
        nodeA.addAdjacentNode(nodeB, 2);
        nodeA.addAdjacentNode(nodeC, 4);
        nodeB.addAdjacentNode(nodeC, 3);
        nodeB.addAdjacentNode(nodeD, 1);
        nodeB.addAdjacentNode(nodeE, 5);
        nodeC.addAdjacentNode(nodeD, 2);
        nodeD.addAdjacentNode(nodeE, 1);
        nodeD.addAdjacentNode(nodeF, 4);
        nodeE.addAdjacentNode(nodeF, 2);
        calculateShortestPath(nodeA);

        for (NodeDijkstra node : List.of(nodeA, nodeB, nodeC, nodeD, nodeE, nodeF)) {
            System.out.print("Path to " + node.getName() + ": ");
            node.getShortestPath().forEach(n -> System.out.print(n.getName() + " -> "));
            System.out.println(node.getName() + " (Dist: " + node.getDistance() + ")");
        }
    }
}
