package solutions.randomTasks;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

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
        ArrayList<String> expectedValues = FindKeysByValuesHashMap.findKeysByValues(hashMap, listOfValues);
        ArrayList<String> actualValues = FindKeysByValuesHashMapTest.findKeysByValues(hashMap, listOfValues);
        assertEquals(expectedValues, actualValues);
    }
}