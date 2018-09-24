    /*
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     */

	 static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode head, int data, int position) {

        int currentPosition = 0;
        while(head != null) {
            
            if(currentPosition - 1 == position) {
                
                SinglyLinkedListNode temp = new SinglyLinkedListNode(data);
                
                temp.next = head.next;
                head.next = temp;
                
                break;
            }
            
            currentPosition++;
            head = head.next;
        }
        
        return head;
    }