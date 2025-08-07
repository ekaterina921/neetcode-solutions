package solutions.randomTasks;

public class FoodDistribution {
    public static int[] beggars(int[] values, int n) {
        if (n <= 0 ) return new int[]{};
        int[] beggarsGain = new int[n];
        int currentBeggar = 0;
        for (int value : values) {
            beggarsGain[currentBeggar] += value;
            if (currentBeggar < beggarsGain.length - 1) {
                currentBeggar++;
            } else {
                currentBeggar = 0;
            }
        }
        return beggarsGain;
    }
    public static int[] beggars1(int[] values, int n) {
        int[] result;

        if (n < 1) {//return empty array
            result = new int[0];
        } else {
            result = new int[n];
            for (int i = 0; i < values.length; i++) {

                // add value to currently queued element
                int i1 = i % n;
                result[i1] += values[i];
            }
        }

        return result;
    }
}
