package solutions.arrays;

import java.sql.Array;
import java.util.*;
import java.util.stream.Collectors;

public class DuplicatesInArrays {

    //check if array has duplicates
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> numsWithoutDuplicates = Arrays.stream(nums) // Create an IntStream
                .boxed()          // Box each int to an Integer
                .collect(Collectors.toSet()); // Collect to Set
        return nums.length != numsWithoutDuplicates.size();
    }

    //check if array has duplicates
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

    //remove duplicates
    public static int[] distinct(int[] array){
        return Arrays.stream(array).distinct().toArray();
    }
    //remove duplicates
    public static ArrayList<Integer> distinct1(ArrayList<Integer> arrayList){
        HashSet<Integer> hasSet = new HashSet<>(arrayList);
        return new ArrayList<>(hasSet);
    }

    public static <T> boolean checkForDuplicateValuesInArrays(ArrayList<T> arrayList1, ArrayList<T> arrayList2){
        //brute force
        for (T value : arrayList1) {
            for (T t : arrayList2) {
                if (value.equals(t)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static <T> boolean checkForDuplicateValuesInArrays1(ArrayList<T> arrayList1, ArrayList<T> arrayList2){
        //using hashset (better time complexity)

        if (arrayList1 == null || arrayList2 == null){
            return false;
        }

        Set<T> newSet = new HashSet<>(arrayList1);
        for (T value : arrayList2){
            if (newSet.contains(value)){
                return true;
            }
        }
        return false;
    }

    public static <T> boolean checkForDuplicateValuesInArrays2(ArrayList<T> arrayList1, ArrayList<T> arrayList2){
        //using streams
        if (arrayList1 == null || arrayList2 == null){
            return false;
        }

        HashSet<T> set1 = new HashSet<>(arrayList1);

        return arrayList2.stream().anyMatch(set1::contains);

    }

    //Solve with sets and streams CheckForDuplicateValues and return them!
    public static <T> ArrayList<T> returnDuplicateValuesInArrays(ArrayList<T> arrayList1, ArrayList<T> arrayList2){
        ArrayList<T> arrayListToReturn = new ArrayList<>();
        if (arrayList1 == null || arrayList2 == null){
            return arrayListToReturn;
        }

        Set<T> set1 = new HashSet<>(arrayList1);
        for(T value : arrayList2){
            if(set1.contains(value)){
                arrayListToReturn.add(value);
            }
        }
        return arrayListToReturn;
    }

    public static <T> ArrayList<T> returnDuplicateValuesInArraysStreams(ArrayList<T> arrayList1, ArrayList<T> arrayList2){
        if (arrayList1 == null || arrayList2 == null){
            return new ArrayList<T>();
        }
        Set<T> newSet = new HashSet<>(arrayList1);
        return (ArrayList<T>) arrayList2.stream().filter(newSet :: contains).collect(Collectors.toList());
    }
}


