import static java.lang.System.in;

class Prime {
    
    public static void checkPrime(int ...number) {
        
        for(int i : number) {
            
            boolean isPrime = true;
            
            if(i <= 1) {
                
                isPrime = false;
            }
            
            if(i == 2) {
                
                isPrime = true;
            }
            
            else {
            
                for(int j = 2; j < i; j++) {

                    if(i % j == 0) {

                        isPrime = false;
                        break;
                    }
                }
                
            }
            
            if(isPrime == true) {
                
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}