package solutions.randomTasks;

import java.util.Arrays;

public class ArrayValuesInversion {
    public static int[] invertValues(int[] array) {
        return Arrays.stream(array).map(s -> -s).toArray();
    }

}
