package solutions.randomTasks;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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
}
