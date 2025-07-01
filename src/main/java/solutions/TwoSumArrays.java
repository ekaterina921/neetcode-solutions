package solutions;

public class TwoSumArrays {
    public static int[] twoSum(int[] nums, int target) {
        int indexOne = -1;
        int indexTwo = -1;
        for (int inner=0; inner < nums.length; inner++) {
            for (int outer=0; outer < nums.length; outer++) {
                if (outer != inner
                        && nums[outer] + nums[inner] == target) {
                    if(inner < outer) {
                        indexOne = inner;
                        indexTwo = outer;
                        break;
                    } else {
                        indexOne = outer;
                        indexTwo = inner;
                        break;
                    }
                }
                }
            }
        return new int[]{indexOne, indexTwo};
        }
    }
