
/*
interface PerformOperation {
	
	boolean check(int a);
}
class MyMath {
	
	public static boolean checker(PerformOperation p, int num) {
  		return p.check(num);
 	}
 */


public static PerformOperation isOdd() {
        
    return (int a) -> a % 2 != 0;
}
    
public static PerformOperation isPrime() {
    
    return (int a) -> java.math.BigInteger.valueOf(a).isProbablePrime(1);
}
    
public static PerformOperation isPalindrome() {
    return (int a) ->  Integer.toString(a).
        equals(new StringBuilder(Integer.toString(a)).reverse().toString());
}