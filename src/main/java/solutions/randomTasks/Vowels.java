package solutions.randomTasks;

public class Vowels {

        public static int getCount(String str) {
            int counter = 0;
            for (char ch : str.toCharArray()) {
               counter += (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') ? 1: 0;
            }
            return counter;
        }

    public static int getCountRegex(String str) {
        return str.replaceAll("(?i)[^aeiou]", "").length();
    }
}
