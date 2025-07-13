package solutions.linkedList;

public class MergingTwoSortedLists {
    public static ReversedLinkedList mergeTwoLists(ReversedLinkedList list1, ReversedLinkedList list2){
        ReversedLinkedList dummy = new ReversedLinkedList(0);
        ReversedLinkedList node = dummy;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                node.next = list1;
                list1 = list1.next;
            } else {
                node.next = list2;
                list2 = list2.next;
            }
            node = node.next;
        }

        if (list1 != null) {
            node.next = list1;
        } else {
            node.next = list2;
        }

        return dummy.next;
    }
}
