/*
 * DoublyLinkedListNode {
 *      int data;
 *      DoublyLinkedListNode next;
 *      DoublyLinkedListNode prev;
 *  }
 */

static DoublyLinkedListNode reverse(DoublyLinkedListNode head) {

    if(head.next == null) {
        
        return head;
    }
    
    DoublyLinkedListNode curr = head;
    DoublyLinkedListNode prev = null;
    DoublyLinkedListNode next = null;
    
    while(curr != null) {
        
        next = curr.next;
        prev = curr.prev;
        curr.prev = curr.next;
        curr.next = prev;
        
        curr = next;
    }
    
    head = prev.prev;
    
    return head;
}