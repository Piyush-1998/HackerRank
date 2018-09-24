import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        ArrayList<ArrayList<Integer>> listOfIntegers = new ArrayList<ArrayList<Integer>>();
        
        Scanner scan = new Scanner(System.in);
        
        int numberOfLists = scan.nextInt();
        
        int currentIndex = 0;
        while(currentIndex < numberOfLists) {
            
            int sizeOfList = scan.nextInt();
            ArrayList<Integer> currentList = new ArrayList<Integer>();
            for(int j = 0; j < sizeOfList; j++) {
                
                int currentInteger = scan.nextInt();
                currentList.add(currentInteger);
            }
            listOfIntegers.add(currentList);
            currentIndex++;
        }
        
        int numberOfQueries = scan.nextInt();
        
        for(int i = 0; i < numberOfQueries; i++) {

            int x = scan.nextInt();
            int y = scan.nextInt();
            
            if(listOfIntegers.get(x - 1).size() < y) {
                
                System.out.println("ERROR!");
            }
            
            else {
            
                System.out.println(listOfIntegers.get(x - 1).get(y - 1));
            }
        }
        scan.close();
    }
}