package solutions.randomTasks;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import solutions.arrays.DuplicatesInArrays;

import java.util.*;

public class OtherTests {
    @Test
    public void testFindingKeysByValues() {
        HashMap<String, String> hashMap = new HashMap<>(Map.of(
                "One", "OneV",
                "Two", "TwoV",
                "Three", "ThreeV",
                "Four", "FourV",
                "Five", "FiveV"));
        ArrayList<String> listOfValues = new ArrayList<>(Arrays.asList("TwoV", "ThreeV"));
        ArrayList<String> expectedValues = new ArrayList<>(List.of("Two", "Three"));
        ArrayList<String> actualValues = FindKeysByValuesHashMapTest.findKeysByValues(hashMap, listOfValues);
        assertEquals(expectedValues, actualValues);
    }


    @ParameterizedTest
    @CsvSource(value = {
            "One;Two;Three,Two;Three;Four,Two;Three",
            "Alpha;Beta;Gamma,Beta;Delta;Epsilon,Beta"
    })
    public void testReturningDuplicatesFromTwoArrays(String list1, String list2, String expectedList){
        ArrayList<String> arrayList1 = new ArrayList<>(Arrays.asList(list1.split(";")));
        ArrayList<String> arrayList2 = new ArrayList<>(Arrays.asList(list2.split(";")));
        ArrayList<String> expected = new ArrayList<>(Arrays.asList(expectedList.split(";")));
        ArrayList<String> actual1 = DuplicatesInArrays.returnDuplicateValuesInArrays(arrayList1, arrayList2);
        ArrayList<String> actual2 = DuplicatesInArrays.returnDuplicateValuesInArraysStreams(arrayList1, arrayList2);
        assertEquals(expected, actual1);
        assertEquals(expected, actual2);
    }
}