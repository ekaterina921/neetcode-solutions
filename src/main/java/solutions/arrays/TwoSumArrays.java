package solutions.arrays;

import java.util.HashMap;
import java.util.Map;

public class TwoSumArrays {
    public static int[] twoSum(int[] nums, int target) {
        for (int inner = 0; inner < nums.length; inner++) {
            for (int outer = inner + 1; outer < nums.length; outer++) {
                if (nums[outer] + nums[inner] == target) {
                    return new int[]{inner, outer};
                }
            }
        }
        return new int[0];
    }

    public static int[] twoSumImprovedComplexity(int[] nums, int target) {
        Map<Integer, Integer> prevMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int diff = target - num;

            if (prevMap.containsKey(diff)) {
                return new int[] { prevMap.get(diff), i };
            }

            prevMap.put(num, i);
        }

        return new int[] {};
    }
    }
