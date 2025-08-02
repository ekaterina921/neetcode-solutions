package solutions.randomTasks;

public class Vowels {

        public static int getCount(String str) {
            int counter = 0;
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    counter++;
                }
            }
            return counter;
        }
}
