package solutions.binarySearch;

import java.util.Arrays;

public class BinarySearchTest {
    public static int searchTest(int[] numbers, int target) {
        int leftPointer = 0, rightPointer = numbers.length - 1;
        while (leftPointer <= rightPointer){
            int middle = leftPointer + (rightPointer - leftPointer)/2;
            if (numbers[middle] > target) {
                rightPointer = middle - 1;
            } else if (numbers[middle] < target) {
                leftPointer = middle + 1;
            } else {
                return middle;
            }
        }
        return -1;
    }

    public static int searchArraysTest(int [] numbers, int target) {
        int index = Arrays.binarySearch(numbers, target);
        return (index >= 0) ? index : -1;
    }
}
