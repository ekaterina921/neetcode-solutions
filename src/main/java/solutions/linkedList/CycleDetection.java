package solutions.linkedList;

public class CycleDetection {
    public static boolean detectCycle(ReversedLinkedList head){
        ReversedLinkedList slow = head;
        ReversedLinkedList fast = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) return true;
        }
        return false;
    }
}
