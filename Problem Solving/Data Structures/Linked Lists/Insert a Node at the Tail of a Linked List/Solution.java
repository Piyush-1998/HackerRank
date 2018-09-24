    /*
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     */

	static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
        
        if(head == null) {
            
            SinglyLinkedListNode node = new SinglyLinkedListNode(data);
            node.next = null;
            
            head = node;
            
            return head;
        }
        
        SinglyLinkedListNode tailNode = new SinglyLinkedListNode(data);
        tailNode.next = null;
        
        SinglyLinkedListNode current = head;

        while(current.next != null) {
            
            current = current.next;
        }
        
        current.next = tailNode;
        
        return head;
	}