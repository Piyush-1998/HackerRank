import java.util.LinkedList;
import java.util.Scanner;

public class BFS {

    static void readData(String[] inData)
    {
        Scanner sc = new Scanner(System.in);
        
        int times = sc.nextInt();
        
        while (times-- > 0)
        {
            int nodes = sc.nextInt();
            int edges = sc.nextInt();
            
            int[][] data = new int[nodes + 1][nodes + 1];
            
            for (int i = 0; i < edges; i++)
            {
                int row = sc.nextInt();
                int col = sc.nextInt();
                
                data[row][col] = 1;
                data[col][row] = 1;
                
                data[row][0]++;
                data[col][0]++;
            }
            
            int start = sc.nextInt();
            
            int[] paths = new int[nodes + 1];
            boolean[] isVisited = new boolean[nodes + 1];
            
            for (int i = 0; i < paths.length; i++)
            {
                isVisited[i] = false;
                paths[i] = Integer.MAX_VALUE;
            }
            
            shortestPath(data, isVisited, paths, start);
            
            for (int i = 1; i < paths.length; i++)
            {
                if (i != start)
                {
                    int ans = (paths[i] == Integer.MAX_VALUE) ? -1 : (paths[i] * 6);
                    System.out.print(ans+" ");
                }
            }
            
            System.out.println("");
        }
        
        sc.close();
    }
    
    static void shortestPath(int[][] matrix, boolean[] isVisited, int[] paths, int start)
    {
        LinkedList<Integer> queue = new LinkedList<Integer>();
        
        paths[start] = 0;
        queue.add(start);
        
        while (queue.size() > 0)
        {
            int current = queue.remove();
            
            if (matrix[current][0] == 0)
                continue;
            
            for (int neighbour = 1; neighbour < matrix[current].length; neighbour++)
            {               
                if (matrix[current][neighbour] == 0 || isVisited[neighbour])
                    continue;
                
                if (!isVisited[neighbour]) { 
                    
                    queue.add(neighbour);
                    isVisited[current] = true;
                    
                    if (paths[current] + matrix[current][neighbour] < paths[neighbour]) {
                        
                        paths[neighbour] = paths[current] + matrix[current][neighbour];
                    }
                }
            }   
        }
    }
    
    public static void main(String args[])
    {
        readData(args);
    }
}
