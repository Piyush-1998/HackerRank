/*
 * interface AdvancedArithmetic {
 * 		int divisor_sum(int n);
 * }
 */

class MyCalculator implements AdvancedArithmetic {
    
    @Override
    public int divisor_sum(int n) {
        
        int divisorSum = 0;
        for(int i = 1; i <= n; i++) {
            
            if(n % i == 0) {
                
                divisorSum+=i;
            }
        }
        return divisorSum;
    }
}