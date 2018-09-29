import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class Graph {

    static class Pair implements Comparable<Pair> {
        
        int to;
        int weight;
        
        Pair() {
            
            this.to = 0;
            this.weight = 0;
        }
        
        Pair(int to, int weight) {
            
            this.to = to;
            this.weight = weight;
        }
                
        // change duplicate edge, change weight if its less than previous
        public int compareTo(Pair other){
            
            if(this.weight != other.weight) {
                
                return this.weight - other.weight;
            }
            
            return this.to - other.to;
        }
    }
    
    ArrayList<Pair>[] adjacencyList;
    int vertices;
    
    @SuppressWarnings("unchecked")
    Graph(int vertices) {
        
        this.vertices = vertices;
        adjacencyList = new ArrayList[vertices];
        
        for(int i = 0; i < vertices; i++) {
            
            adjacencyList[i] = new ArrayList<>();
        }
    }
    
    public void addEdge(int v1, int v2, int weight) {
        
        adjacencyList[v1].add(new Pair(v2, weight));
        adjacencyList[v2].add(new Pair(v1, weight));    
    }
    
    public void shortestReach(int startVertex) throws Exception {
        
        if(vertices <= 0) {
            
            throw new Exception("Invalid Graph");
        }
        
        boolean[] visited = new boolean[vertices];
        
        // array with shortest distance to every vertex
        int[] dist = new int[vertices];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[startVertex] = 0;
  
        // find shortest path
        for(int i = 0; i < vertices - 1; i++) {
            
            int vertex = findMin(dist, visited);
            visited[vertex] = true;
            
            // find neighbours of current vertex
            for(int j = 0; j < adjacencyList[vertex].size(); j++) {
                
                int neighbour = adjacencyList[vertex].get(j).to;
                int weight = adjacencyList[vertex].get(j).weight;
                int distance = dist[vertex] + weight;
                
                if(visited[neighbour] == false 
                   && distance < dist[neighbour] && dist[vertex] != Integer.MAX_VALUE) {
                    
                    dist[neighbour] = distance;
                }
            }    
        }
        
        // print shortest paths from start vertex to other vertices
        printPaths(dist, startVertex);
    }
    
    public int findMin(int[] dist, boolean[] visited) {
        
        int minWeight = Integer.MAX_VALUE;
        int minVertex = -1;
        
        for(int i = 0; i < vertices; i++) {
            
            if(visited[i] == false && dist[i] <= minWeight) {
                
                minWeight = dist[i];
                minVertex = i;
            }
        }
        
        return minVertex;
    }
    
    public void printPaths(int[] dist, int startVertex) {
        
        for(int i = 0; i < dist.length; i++) {
            
            if(i != startVertex) {
                
                if(dist[i] == Integer.MAX_VALUE) {
                    
                    System.out.print(-1);
                }
                
                else {
                    
                    System.out.print(dist[i]);
                }
                
                System.out.print(" ");
            }
        }
    }
    
    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int testCases = Integer.parseInt(br.readLine());
        int vertices, edges, v1, v2, weight, start;
        for(int i = 0; i < testCases; i++)
        {
            st = new StringTokenizer(br.readLine());
            vertices = Integer.parseInt(st.nextToken());
            edges = Integer.parseInt(st.nextToken());
            
            Graph graph = new Graph(vertices);
            
            for(int j = 0; j < edges; j++)
            {
                st = new StringTokenizer(br.readLine());
                v1 = Integer.parseInt(st.nextToken());
                v2 = Integer.parseInt(st.nextToken());
                weight = Integer.parseInt(st.nextToken());
                v1--;v2--;
                graph.addEdge(v1, v2, weight);
            }        
            
            start = Integer.parseInt(br.readLine());
            start--;
                    
            graph.shortestReach(start);
            System.out.println();
        }    
    }
}