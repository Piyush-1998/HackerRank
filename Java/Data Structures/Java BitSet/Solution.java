import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int size = sc.nextInt();
        int operations = sc.nextInt();
        
        BitSet b1 = new BitSet(size);
        BitSet b2 = new BitSet(size);
        
        for(int i = 0; i < operations; i++) {
            
            String currentOperation = sc.next();
            
            if(currentOperation.equals("AND")) {
            
                int firstBitSet = sc.nextInt();
                int secondBitSet = sc.nextInt();
                
                if(firstBitSet == 1 && secondBitSet == 2) {
                    
                    b1.and(b2);
                }
                
                else {
                    
                    b2.and(b1);
                }
                
                System.out.println(b1.cardinality() + " " + b2.cardinality());
            }
            
            else if(currentOperation.equals("SET")) {
                
                int bitSet = sc.nextInt();
                int index = sc.nextInt();
                
                if(bitSet == 1) {
                    
                    b1.set(index, true);
                }
                
                else {
                    
                    b2.set(index, true);
                }
                
                System.out.println(b1.cardinality() + " " + b2.cardinality());
            }
            
            else if(currentOperation.equals("FLIP")) {
                
                int bitSet = sc.nextInt();
                int index = sc.nextInt();
                
                if(bitSet == 1) {
                    
                    b1.flip(index);
                }
                
                else {
                    
                    b2.flip(index);
                }
                
                System.out.println(b1.cardinality() + " " + b2.cardinality());
            }
            
            else if(currentOperation.equals("OR")) {
                
                int firstBitSet = sc.nextInt();
                int secondBitSet = sc.nextInt();
                
                if(firstBitSet == 1 && secondBitSet == 2) {
                    
                    b1.or(b2);
                }
                
                else {
                    
                    b2.or(b1);
                }
                
                System.out.println(b1.cardinality() + " " + b2.cardinality());
            }
            
            else if(currentOperation.equals("XOR")) {
                
                int firstBitSet = sc.nextInt();
                int secondBitSet = sc.nextInt();
                
                if(firstBitSet == 1 && secondBitSet == 2) {
                    
                    b1.xor(b2);
                }
                
                else {
                    
                    b2.xor(b1);
                }
                
                System.out.println(b1.cardinality() + " " + b2.cardinality());
            }        
        }
        sc.close();
    }
}
