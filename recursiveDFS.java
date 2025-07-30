import java.util.*;

public class recursiveDFS {

    public void printDFS(Map<String, List<String>> graph, String start, Set<String> visited) {
        if (visited.contains(start)) {
            return;
        }

        visited.add(start);
        System.out.println(start);

        List<String> neighbours = graph.get(start);
        if (neighbours != null) {
            for (String neighbour : neighbours) {
                printDFS(graph, neighbour, visited);
            }
        }
    }

    public static void main(String[] args) {
        recursiveDFS obj = new recursiveDFS();

        Map<String, List<String>> graph = new HashMap<>();
        graph.put("A", Arrays.asList("B", "C"));
        graph.put("B", Arrays.asList("A", "D", "E"));
        graph.put("C", Arrays.asList("A", "F"));
        graph.put("D", Arrays.asList("B"));
        graph.put("E", Arrays.asList("B", "F"));
        graph.put("F", Arrays.asList("C", "E"));

        Set<String> visited = new HashSet<>();
        obj.printDFS(graph, "A", visited);
    }
}
