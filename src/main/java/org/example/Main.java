package org.example;

import OOP.AbstractClass;
import OOP.InterfaceForTest;
import OOP.SuccessorA1;
import OOP.SuccessorA2;
import solutions.arrays.DuplicatesInArrays;
import solutions.arrays.TwoSumArrays;
import solutions.arrays.ValidAnagramArrays;
import solutions.binarySearch.BinarySearchTest;
import solutions.randomTasks.FindKeysByValuesHashMap;
import solutions.randomTasks.FindKeysByValuesHashMapTest;
import solutions.randomTasks.FoodDistribution;
import solutions.randomTasks.ReversingWords;
import solutions.slidingWindow.BestTimeToBuyAndSellStock;
import solutions.trees.BinaryTree;
import solutions.twoPointers.ValidPalindromeTwoPointers;

import java.util.*;

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
//        Integer[] treeValues = {1, 2, 3, null, null, 4};
//        BinaryTree binaryTree = new BinaryTree().buildTree(treeValues);
//        System.out.println(BinaryTree.maxDepthBFS(binaryTree));
//        System.out.println(ReversingWords.reverseWordByWord2("lazy dog."));
//        var r = FoodDistribution.beggars1(new int[]{1, 2, 3, 4, 5, 6}, 3);
//        InterfaceForTest interfaceForTest = new SuccessorA2();
//        interfaceForTest.walk();
//        AbstractClass abstractClass = new SuccessorA1(1);
//        abstractClass.fly();
//        System.out.println(abstractClass.str);

        //Test 1, non-empty lists with duplicates
        ArrayList<String> arrayList1 = new ArrayList<>(List.of("One", "Two", "Three"));
        ArrayList<String> arrayList2 = new ArrayList<>(List.of("Two", "Three", "Four"));
        System.out.println(DuplicatesInArrays.returnDuplicateValuesInArrays(arrayList1, arrayList2));
        System.out.println(DuplicatesInArrays.returnDuplicateValuesInArraysStreams(arrayList1, arrayList2));

        //Test 2, empty lists
        ArrayList<String> arrayList3 = new ArrayList<>();
        ArrayList<String> arrayList4 = new ArrayList<>();
        System.out.println(DuplicatesInArrays.returnDuplicateValuesInArrays(arrayList3, arrayList4));
        System.out.println(DuplicatesInArrays.returnDuplicateValuesInArraysStreams(arrayList3, arrayList4));

        //Test3, non-empty lists without duplicates
        ArrayList<String> arrayList5 = new ArrayList<>(List.of("One", "Two", "Three"));
        ArrayList<String> arrayList6 = new ArrayList<>(List.of("Four"));
        System.out.println(DuplicatesInArrays.returnDuplicateValuesInArrays(arrayList5, arrayList6));
        System.out.println(DuplicatesInArrays.returnDuplicateValuesInArraysStreams(arrayList5, arrayList6));

        //Test4, one empty list
        ArrayList<String> arrayList7 = new ArrayList<>(List.of("One", "Two", "Three"));
        ArrayList<String> arrayList8 = new ArrayList<>();
        System.out.println(DuplicatesInArrays.returnDuplicateValuesInArrays(arrayList7, arrayList8));
        System.out.println(DuplicatesInArrays.returnDuplicateValuesInArraysStreams(arrayList7, arrayList8));

        //Test5, non-empty lists with 1 duplicate value
        ArrayList<String> arrayList9 = new ArrayList<>(List.of("One", "Two", "Three"));
        ArrayList<String> arrayList10 = new ArrayList<>(List.of("One", "Four", "Five"));
        System.out.println(DuplicatesInArrays.returnDuplicateValuesInArrays(arrayList9, arrayList10));
        System.out.println(DuplicatesInArrays.returnDuplicateValuesInArraysStreams(arrayList9, arrayList10));
    }
}