import java.util.*;

public class bfs {
    // Map<String,List<String>> graph = new HashMap<>();
    

    private void bfs(Map<String,List<String>> graph,String start){
        Queue<String> queue = new LinkedList<>();
        List<String> visited = new ArrayList<>();

        queue.offer(start);
        visited.add(start);
        while(!queue.isEmpty()){
            String curr = queue.poll();
            System.out.println(curr);
            List<String> neighbours = graph.getOrDefault(curr,new ArrayList<>());
            for(String neighbour:neighbours){
                if(!visited.contains(neighbour)){
                    queue.offer(neighbour);
                    visited.add(neighbour);
                }
            }
        }
    }

    public static void main(String[] args) {
        bfs BFS = new bfs();
        Map<String,List<String>> graph = new HashMap<>();
        graph.put("A", Arrays.asList("B","C"));
        graph.put("B", Arrays.asList("A","D","E"));
        graph.put("C", Arrays.asList("A","F"));
        graph.put("D", Arrays.asList("B"));
        graph.put("E", Arrays.asList("B","F"));
        graph.put("F", Arrays.asList("C","E"));
        BFS.bfs(graph,"A");
    }
}   
