public static String getSmallestAndLargest(String s, int k) {
        
        if(k > s.length()) {
            
            return "Invalid";
        }
        
        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);
        
        for(int startIndex = 1; startIndex < s.length(); startIndex++) {
            
            if(startIndex + k <= s.length()) {
                         
                int endIndex = startIndex + k; // exclusive
                String subString = s.substring(startIndex, endIndex);
                
                // subString < smallest
                if(subString.compareTo(smallest) < 0) {
                    
                    smallest = subString;     
                }

                // subString > largest
                if(subString.compareTo(largest) > 0) {

                    largest = subString;
                }
            }
        } 
        
        
        return smallest + "\n" + largest;
    }