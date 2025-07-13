package solutions.linkedList;

public class ReversedLinkedListTest {
    int val;
    ReversedLinkedListTest listNode;
    public ReversedLinkedListTest() {};
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
}
