package solutions.binarySearch;

import java.util.Arrays;

public class BinarySearch {
    public static int search(int[] nums, int target) {
        int leftPointer = 0, rightPointer = nums.length - 1;
        while (leftPointer <= rightPointer) {
            int middle = leftPointer + ((rightPointer - leftPointer)/2);
            if (nums[middle] > target) {
                rightPointer = middle - 1;
            } else if (nums[middle] < target) {
                leftPointer = middle + 1;
            } else {
                return middle;
            }
        }
        return -1;
    }

    public static int searchBuiltInFeature(int[] nums, int target){
        int index = Arrays.binarySearch(nums, target);
        return (index >= 0) ? index : -1;
    }
}
