import java.util.*;

class Solution{
	
	public static void main(String []argh)
	{
		Scanner in = new Scanner(System.in);
		
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        
        int n=in.nextInt();
		
        in.nextLine();
		
        for(int i=0;i<n;i++) {
        	
			String name=in.nextLine();
			int phone=in.nextInt();
			in.nextLine();
            
            map.put(name, phone);
            
		}
        
		while(in.hasNext()) {
			
			String s=in.nextLine();
            if(!map.keySet().contains(s)) {
                
                System.out.println("Not found");
            }
            
            else {
                
                System.out.println(s + "=" + map.get(s));
            }
		}
		
		in.close();
	}
}
