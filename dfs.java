import java.util.*;

public class dfs {
    public void printDFS(Map<String,List<String>> graph,String start){
        Set<String> visited  = new HashSet<>();
        Stack<String> stack = new Stack<>();
        stack.push(start);
        visited.add(start);
        while(!stack.isEmpty()){
            String current = stack.pop();
            System.out.println(current);
            List<String> neighbours = graph.getOrDefault(current, new ArrayList<>(0));
            for(String neighbour:neighbours){
                if(!visited.contains(neighbour)){
                    stack.push(neighbour);
                    visited.add(neighbour);
                }
            }
        }
    }
    public static void main(String[] args){
        dfs obj = new dfs();
        Map<String,List<String>> graph = new HashMap<>();
        graph.put("A", Arrays.asList("B","C"));
        graph.put("B", Arrays.asList("A","D","E"));
        graph.put("C", Arrays.asList("A","F"));
        graph.put("D", Arrays.asList("B"));
        graph.put("E", Arrays.asList("B","F"));
        graph.put("F", Arrays.asList("C","E"));
        obj.printDFS(graph,"A");
    }
}
