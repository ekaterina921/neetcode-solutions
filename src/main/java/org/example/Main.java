package org.example;

import solutions.DuplicatesInArrays;
import solutions.TwoSumArrays;
import solutions.ValidAnagramArrays;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println((new DuplicatesInArrays()).hasDuplicate(new int[]{23, 23, 45}));
        System.out.println(ValidAnagramArrays.isAnagram("ccbc", "bbcc"));
        System.out.println(Arrays.toString(TwoSumArrays.twoSum(new int[]{2, 3, 4}, 5)));
    }
}