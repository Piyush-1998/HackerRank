/*
 * Scanner s = new Scanner(System.in);
 * int t = s.nextInt();
 * String [] pair_left = new String[t];
 * String [] pair_right = new String[t];
 */

HashSet<String> uniqueSet = new HashSet<String>();

for(int i = 0; i < t; i++) {
    
    uniqueSet.add(pair_left[i] + "|" + pair_right[i]);
    System.out.println(uniqueSet.size());
}