package solutions.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicatesInArrays {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> numsWithoutDuplicates = Arrays.stream(nums) // Create an IntStream
                .boxed()          // Box each int to an Integer
                .collect(Collectors.toSet()); // Collect to Set
        return nums.length != numsWithoutDuplicates.size();
    }

    public boolean hasDuplicateAltSolution(int[] nums){
        HashSet<Integer> numsWithoutDuplicates = new HashSet<>();
        for (int num : nums) {
            if (numsWithoutDuplicates.contains(num)) {
                return true;
            }
            numsWithoutDuplicates.add(num);
        }
        return false;
    }
}


