package solutions.randomTasks;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.function.Function;

public class ListFiltering {
    public static List<Object> filterList(final List<Object> list){
        return list.stream().filter(s -> s instanceof Integer).collect(Collectors.toList());
    }

    public static List<Object> filterList1(final List<Object> list){
        List<Object> filteredList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) instanceof Integer){
                filteredList.add(list.get(i));
            }
        }
        return filteredList;
    }

    public static <T,R> Object[][] gridMap(Function<T,R> fn, T[][] list) {
        return Arrays.stream(list)
                .map(innerArray -> Arrays.stream(innerArray)
                                .map(fn)
                                .toArray()
                ).toArray(Object[][]::new);
    }

    class Node<T> {
        public T data;
        public Node<T> next;

        Node(T data, Node next) {
            this.data = data;
            this.next = next;
        }

        Node(T data) {
            this(data, null);
        }


    public <T> Node<T> filterLinkedList(Node<T> head, Predicate<T> p){
            Node<T> current = head;
            Node<T> headToReturn = null;
            Node<T> newTail = null;
            while(current != null) {
                if(p.test(current.data)) {
                    if (headToReturn == null) {
                        headToReturn = new Node<T>(current.data);
                        newTail = headToReturn;
                    } else {
                        newTail.next = new Node<T>(current.data);
                        newTail = newTail.next;
                    }
                }
                current = current.next;
        }
        return headToReturn;
    }

    public <T> Node<T> filterLinkedListTwoVariables(Node<T> head, Predicate<T> p){
            Node<T> newHead = new Node<>(null);
            Node<T> current = newHead;
            while(head != null){
                if(p.test(head.data)){
                    current.next = new Node<T>(head.data);
                    current = current.next;
                }
                head = head.next;
            }
            return newHead.next;
    }
    }
}
