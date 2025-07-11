package solutions.linkedList;

public class ReversedLinkedList {
    int val;
    ReversedLinkedList next;
    ReversedLinkedList(){}
    ReversedLinkedList(int val){this.val = val;}
    ReversedLinkedList(int val, ReversedLinkedList next){this.val = val; this.next = next;}

    public ReversedLinkedList reverseLinkedList(ReversedLinkedList head) {
        ReversedLinkedList previous = null;
        ReversedLinkedList current = head;

        while (current != null) {
            ReversedLinkedList next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        return previous;
    }
}
