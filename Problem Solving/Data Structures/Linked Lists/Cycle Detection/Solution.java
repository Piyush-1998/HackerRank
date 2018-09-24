    /*
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     */

	static boolean hasCycle(SinglyLinkedListNode head) {
        
        if(head == null) {
            
            return false;
        }
        
        HashSet<SinglyLinkedListNode> visited = new HashSet<SinglyLinkedListNode>();
        
        while(head != null) {
            
            if(visited.contains(head)) {
                
                return true;
            }
            
            visited.add(head);
            head = head.next;
        }
        
        return false;
    }