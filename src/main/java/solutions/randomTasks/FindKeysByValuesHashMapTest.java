package solutions.randomTasks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class FindKeysByValuesHashMapTest {
    public static <K,V> ArrayList<K> findKeysByValues(HashMap<K, V> hashMap,ArrayList<V> list){
        ArrayList<K> keys = new ArrayList<>();
        HashSet<V> values = new HashSet<>(list);
        for(Map.Entry<K,V> entry : hashMap.entrySet()){
            if (values.contains(entry.getValue())){
                keys.add(entry.getKey());
            }
        }
        return keys;
    }
}
