package String;

import java.util.Scanner;

public class GroupWordCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int count = 0;

        for (int i = 0; i < n; i++) {
            String word = scanner.next();
            if (checkWord(word)) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static boolean checkWord(String word) {
        boolean[] alphabets = new boolean[26];
        for (int i = 0; i < word.length(); i++) {
            char temp = word.charAt(i);
            if (alphabets[temp - 'a']) {
                return false;
            } else if (i < word.length() - 1 && temp != word.charAt(i + 1)) {
                alphabets[temp - 'a'] = true;
            }
        }

        return true;
    }
}
