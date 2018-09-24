    /*
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     */

	 static SinglyLinkedListNode insertNodeAtHead(SinglyLinkedListNode llist, int data) {

        SinglyLinkedListNode head = new SinglyLinkedListNode(data);
        head.next = llist;
        
        return head;
    }