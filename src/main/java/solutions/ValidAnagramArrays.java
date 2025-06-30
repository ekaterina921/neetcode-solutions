package solutions;

import java.util.HashMap;

public class ValidAnagramArrays {
    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        HashMap<String, Integer> hashMapS = new HashMap<>();
        HashMap<String, Integer> hashMapT = new HashMap<>();
        for (int i = 0; i < s.length(); i++){
            String keyS = String.valueOf(s.charAt(i));
            String keyT = String.valueOf(t.charAt(i));
            if (hashMapS.containsKey(keyS)){
                int numberOfLetters = hashMapS.get(keyS) + 1;
               hashMapS.put(keyS, numberOfLetters);
            } else {
                hashMapS.put(keyS, 1);
            }
            if (hashMapT.containsKey(keyT)){
                int numberOfLetters = hashMapT.get(keyT) + 1;
                hashMapT.put(keyT, numberOfLetters);
            } else {
                hashMapT.put(keyT, 1);
            }
        }
        return hashMapS.equals(hashMapT);
    }
}
