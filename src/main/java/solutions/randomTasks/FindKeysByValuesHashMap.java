package solutions.randomTasks;

import java.util.*;
import java.util.stream.Collectors;

public class FindKeysByValuesHashMap {
    public static <T, U> ArrayList<T> findKeysByValues(HashMap<T, U> hashMap, ArrayList<U> values) {
        ArrayList<T> keys = new ArrayList<>();
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

        public static <T, U> ArrayList <T> findKeysByValuesOptimized(HashMap < T, U > hashMap, ArrayList < U > values) {
            ArrayList<T> keys = new ArrayList<>();
            HashSet<U> valueSet = new HashSet<>(values); // O(M) to build the set

            for (Map.Entry<T, U> entry : hashMap.entrySet()) { // Iterate over entries directly
                if (valueSet.contains(entry.getValue())) { // O(1) average lookup in HashSet
                    keys.add(entry.getKey());
                }
            }
            return keys;
        }

        public static <T, U> ArrayList<T> findKeysByValuesStreams(HashMap <T, U> hashMap, ArrayList <U> values) {
        HashSet<U> valueSet = new HashSet<>(values);
        return hashMap.entrySet().stream()
                .filter(entry -> valueSet.contains(entry.getValue()))
                .map(Map.Entry::getKey).collect(Collectors.toCollection(ArrayList::new));
        }
    }

