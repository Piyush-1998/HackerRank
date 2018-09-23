import java.io.*;
import java.util.*;

public class CountingSort {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        final int maxValue = 100;
        
        HashMap<Integer, List<String>> map = new HashMap<>();
        
        for (int i = 0; i < maxValue; i++) {
            
            map.put(i, new ArrayList<String>());
        }
        
        int n = Integer.parseInt(bufferedReader.readLine().trim());
        for (int i = 0; i < n; i++) {
            
        	List<String> pair = Arrays.asList(bufferedReader.readLine().split(" "));
            int key = Integer.parseInt(pair.get(0));
            String value = (i < n / 2) ? "-" : pair.get(1);
            
            List<String> list = map.get(key);
            list.add(value);
        }
        
        bufferedReader.close();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < maxValue; i++) {
            
        	List<String> values = map.get(i);
            for (String str : values) {
                sb.append(str + " ");
            }
        }
        
        System.out.println(sb);
    }
}
