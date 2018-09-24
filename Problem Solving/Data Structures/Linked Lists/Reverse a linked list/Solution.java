    /*
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     */

	static SinglyLinkedListNode reverse(SinglyLinkedListNode head) {
        
        SinglyLinkedListNode prev = null;
        SinglyLinkedListNode next = null;
        SinglyLinkedListNode current = head;
              
        while(current != null) {
            
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        
        head = prev;
        
        return head;
    }