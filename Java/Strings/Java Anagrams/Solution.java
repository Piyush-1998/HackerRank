// using sorting, not hashing
static boolean isAnagram(String a, String b) {
    
    char[] a1 = a.toLowerCase().toCharArray();
    char[] b1 = b.toLowerCase().toCharArray();
    
    java.util.Arrays.sort(a1);
    java.util.Arrays.sort(b1);
    
    if(new String(a1).equals(new String(b1))) {
        
        return true;
    }
    
    return false;
}

static void swap(char[] str, int start, int end) {
    
    char temp = str[start];
    str[start] = str[end];
    str[end] = temp;
}