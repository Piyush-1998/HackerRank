/*
 * SinglyLinkedListNodee {
 *      int data;
 *      SinglyLinkedListNode next;
 *  }
 */

static int getNode(SinglyLinkedListNode head, int positionFromTail) {

    int index = 0;
    SinglyLinkedListNode temp = head;
    while(head != null) {

        head = head.next;
        if(index > positionFromTail) {
            
            temp = temp.next;
        }
        index++;
    }

    return temp.data;
}