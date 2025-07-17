package org.example;

import solutions.arrays.DuplicatesInArrays;
import solutions.arrays.TwoSumArrays;
import solutions.arrays.ValidAnagramArrays;
import solutions.binarySearch.BinarySearchTest;
import solutions.randomTasks.FindKeysByValuesHashMap;
import solutions.randomTasks.FindKeysByValuesHashMapTest;
import solutions.slidingWindow.BestTimeToBuyAndSellStock;
import solutions.trees.BinaryTree;
import solutions.twoPointers.ValidPalindromeTwoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        System.out.println((new DuplicatesInArrays()).hasDuplicate(new int[]{23, 23, 45}));
//        System.out.println(ValidAnagramArrays.isAnagram("ccbc", "bbcc"));
//        System.out.println(BinarySearchTest.searchTest(new int[]{1, 2, 4, 6, 8}, 4));
//        System.out.println(Arrays.toString(TwoSumArrays.twoSumImprovedComplexity(new int[]{2, 3, 4}, 5)));
//        System.out.println(ValidPalindromeTwoPointers.isPalindrome(".,"));
//        System.out.println(BestTimeToBuyAndSellStock.findBestTimeToBuyAndSellStock(new int[]{1, 3, 5}));
        HashMap<String, String> hashMap = new HashMap<> (Map.of(
                "One", "OneV",
                "Two", "TwoV",
                "Three", "ThreeV",
                "Four", "FourV",
                "Five", "FiveV"));
        ArrayList<String> listOfValues = new ArrayList<>(Arrays.asList("TwoV", "ThreeV"));
        System.out.println(FindKeysByValuesHashMap.findKeysByValues(hashMap, listOfValues));
        System.out.println(FindKeysByValuesHashMapTest.findKeysByValues(hashMap, listOfValues));
//        Integer[] treeValues = {1, 2, 3, null, null, 4};
//        BinaryTree binaryTree = new BinaryTree().buildTree(treeValues);
//        System.out.println(BinaryTree.maxDepthBFS(binaryTree));
    }
}