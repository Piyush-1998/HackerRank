    /*
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     */

	static void reversePrint(SinglyLinkedListNode head) {

		Stack<SinglyLinkedListNode> stack = new Stack<SinglyLinkedListNode>();

		//SinglyLinkedListNode temp = head;
    
		while(head != null) {
        
	        stack.push(head);
	        
	        head = head.next;
		}
    
		while(stack.size() > 0) {
        
	        head = stack.pop();
	        System.out.println(head.data);
		}
	}