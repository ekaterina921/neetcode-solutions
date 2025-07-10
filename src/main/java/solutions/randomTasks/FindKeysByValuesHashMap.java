package solutions.randomTasks;

import java.util.ArrayList;
import java.util.HashMap;

public class FindKeysByValuesHashMap {
    public static <T, U> ArrayList<T> findKeysByValues(HashMap<T, U> hashMap, ArrayList<U> values) {
        ArrayList <T> keys = new ArrayList<>();
        for (T key : hashMap.keySet()) {
            U value = hashMap.get(key);
            for (U u : values) {
                if (value.equals(u)) {
                    keys.add(key);
                    break;
                }
            }
        }
        return keys;
    }

}
