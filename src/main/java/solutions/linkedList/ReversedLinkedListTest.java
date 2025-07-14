package solutions.linkedList;

public class ReversedLinkedListTest {
    int val;
    ReversedLinkedListTest listNode;
    public ReversedLinkedListTest() {}
    public ReversedLinkedListTest(int val){this.val = val;}
    public ReversedLinkedListTest(ReversedLinkedListTest listNode, int val){
        this.listNode = listNode;
        this.val = val;
    }

    public static ReversedLinkedListTest reverseListTest(ReversedLinkedListTest head){
        ReversedLinkedListTest previous = null;
        ReversedLinkedListTest current = head;
        while (current != null) {
            ReversedLinkedListTest next = current.listNode;
            current.listNode = previous;
            previous = current;
            current = next;
        }
        return head;
    }

    public static ReversedLinkedListTest mergeTwoSortedLists(ReversedLinkedListTest head1, ReversedLinkedListTest head2){
        ReversedLinkedListTest dummy = new ReversedLinkedListTest(0);
        ReversedLinkedListTest reversedLinkedListTest = dummy;
        while (head1 != null && head2 != null){
            if (head1.val <= head2.val) {
                reversedLinkedListTest.listNode = head1;
                head1 = head1.listNode;
            } else {
                reversedLinkedListTest.listNode = head2;
                head2 = head2.listNode;
            }
            reversedLinkedListTest = reversedLinkedListTest.listNode;
        }
        if (head1 != null){
            reversedLinkedListTest.listNode = head1;
        } else if (head2 != null) {
            reversedLinkedListTest.listNode = head2;
        }
        return dummy.listNode;
    }

    public static boolean detectCycle(ReversedLinkedListTest head){
        ReversedLinkedListTest slow = head;
        ReversedLinkedListTest fast = head;
        while (fast != null && fast.listNode != null) {
            slow = slow.listNode;
            fast = fast.listNode.listNode;
            if(slow == fast) return true;
        }
        return false;
    }
}
