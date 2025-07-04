package org.example;

import solutions.arrays.DuplicatesInArrays;
import solutions.arrays.TwoSumArrays;
import solutions.arrays.ValidAnagramArrays;
import solutions.slidingWindow.BestTimeToBuyAndSellStock;
import solutions.twoPointers.ValidPalindromeTwoPointers;

import javax.swing.plaf.basic.BasicEditorPaneUI;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        System.out.println((new DuplicatesInArrays()).hasDuplicate(new int[]{23, 23, 45}));
//        System.out.println(ValidAnagramArrays.isAnagram("ccbc", "bbcc"));
//        System.out.println(Arrays.toString(TwoSumArrays.twoSumImprovedComplexity(new int[]{2, 3, 4}, 5)));
//          System.out.println(ValidPalindromeTwoPointers.isPalindrome(".,"));
        System.out.println(BestTimeToBuyAndSellStock.findBestTimeToBuyAndSellStock(new int[]{1, 3, 5}));
    }
}