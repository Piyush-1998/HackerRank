    /*
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     */

     static SinglyLinkedListNode deleteNode(SinglyLinkedListNode head, int position) {

        SinglyLinkedListNode temp = head;
        
        if(position == 0) {

            head = head.next;
        }
        
        while(position > 1) {
            
            position--;
            temp = temp.next;
        }
        
        temp.next = temp.next.next;
        
        return head;
    }
