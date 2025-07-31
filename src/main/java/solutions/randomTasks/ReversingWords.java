package solutions.randomTasks;

public class ReversingWords {
    public static String reverseWholeString(final String original) {
        return new StringBuilder(original).reverse().toString();
    }

    public static String reverseWordByWord1(final String original) {
        StringBuilder reversedString = new StringBuilder();
        var res = original.split(" ");

        for (int i = 0; i < res.length; i++) {
            var word = res[i];
            reversedString.append(new StringBuilder(word).reverse());
            if (i != res.length - 1) {
                reversedString.append(' ');
            }
        }

        return reversedString.toString();
    }

    public static String reverseWordByWord(final String original) {
        StringBuilder word = new StringBuilder();
        StringBuilder reversedString = new StringBuilder();

        for (int i = 0; i < original.length(); i++) {
            if (original.charAt(i) == ' ') {
                word.reverse();
                reversedString.append(word).append(' ');
                word.setLength(0);
            } else if (i == original.length() - 1) {
                word.append(original.charAt(i)).reverse();
                reversedString.append(word);
            } else {
                word.append(original.charAt(i));
            }
        }

        return reversedString.toString();
    }
}
