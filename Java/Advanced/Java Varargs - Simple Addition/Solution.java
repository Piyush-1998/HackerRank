class Add {
    
    public static void add(int ...number) {
        
        int sum = 0;
        int counter = 0;
        for(int i : number) {
            
            if(counter != number.length - 1) { 
                
                System.out.print(i + "+");
            }
            
            else {
                
                System.out.print(i);
            }
            
            sum+=i;
            counter++;
        }
        System.out.print("=" + sum);
        System.out.println();
    }
}
