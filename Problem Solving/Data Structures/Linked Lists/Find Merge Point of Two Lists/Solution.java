/*
 * SinglyLinkedListNode {
 *     int data;
 *     SinglyLinkedListNode next;
 * }
 */

static int findMergeNode(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
    
    SinglyLinkedListNode tmp1 = head1;
    
    while(tmp1 != null) {
        
        SinglyLinkedListNode tmp2 = head2;
        
        while(tmp2 != null) {
            
            if(tmp1 == tmp2) {
                
                return tmp1.data;
            }
            
            tmp2 = tmp2.next;
        }
        
        tmp1 = tmp1.next;
    }
    
    return 0;
}
