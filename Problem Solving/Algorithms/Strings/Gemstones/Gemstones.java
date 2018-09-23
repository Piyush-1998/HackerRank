import java.io.*;
import java.util.*;

public class Gemstones {

    static int gemstones(String[] arr) {
    
        HashMap<Character, Integer> map = new HashMap<>();    

        for(int i = 0; i < arr.length; i++) {

            HashSet<Character> visited = new HashSet<>();
            for(int j = 0; j < arr[i].length(); j++) {

                if(!visited.contains(arr[i].charAt(j))) {

                    map.merge(arr[i].charAt(j), 1, Integer::sum);
                    visited.add(arr[i].charAt(j));
                }
            }
        }
        
        int gemStones = 0;
        for(Integer count : map.values()) {
            
            if(count == arr.length) {
                
                gemStones++;
            }
        }
    
        return gemStones;    
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        int n = scanner.nextInt();

        scanner.nextLine();

        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            String arrItem = scanner.nextLine();
            arr[i] = arrItem;
        }

        int result = gemstones(arr);

        System.out.println(result);

        scanner.close();
    }
}

