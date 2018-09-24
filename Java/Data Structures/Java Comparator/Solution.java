class Checker implements Comparator<Player> {
    
    public int compare(Player a, Player b) {
     
        if(Integer.compare(b.score, a.score) == 0) {
            
            return a.name.compareTo(b.name);
        }
        
        return Integer.compare(b.score, a.score);
    }
}