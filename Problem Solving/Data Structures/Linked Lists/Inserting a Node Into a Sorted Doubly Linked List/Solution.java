/*
 * DoublyLinkedListNode {
 *      int data;
 *      DoublyLinkedListNode next;
 *      DoublyLinkedListNode prev;
 *  }
 */

static DoublyLinkedListNode sortedInsert(DoublyLinkedListNode head, int data) {

    // if head is null
    if(head == null) {
        
        head = new DoublyLinkedListNode(data);
        
        return head;
    }
    
    DoublyLinkedListNode tempNode = new DoublyLinkedListNode(data);
    
    // insert at start
    if(data < head.data) {
            
        tempNode.next = head;      
        head = tempNode;
        
        return head;
    }
    
    DoublyLinkedListNode temp = head;
    
    while(temp.data <= data) {
        
        // insert at end
        if(temp.next == null && temp.data <= data) {
            
            temp.next = tempNode;
            
            return head;
        }
        
        temp = temp.next;
    }
    
    tempNode.next = temp;
    temp.prev.next = tempNode;  

    return head;
}