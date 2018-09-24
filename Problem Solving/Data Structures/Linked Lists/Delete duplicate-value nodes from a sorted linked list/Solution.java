/*
 * SinglyLinkedListNode {
 *     int data;
 *     SinglyLinkedListNode next;
 * }
 */

static SinglyLinkedListNode removeDuplicates(SinglyLinkedListNode head) {

    SinglyLinkedListNode temp = head;
    while(temp.next != null) {

        if(temp.data == temp.next.data) {

            temp.next = temp.next.next;
        }

        else if (temp.next != null) {

            temp = temp.next;
        }
    }

    return head;
}
