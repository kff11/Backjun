package String;

import java.util.Scanner;

public class Alphabet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.next();

        for (int i = 97; i <= 122; i++) {
            for (int j = 0; j < s.length(); j++) {
                if (i == (int) s.charAt(j)) {
                    System.out.print(j + " ");
                    break;
                } else if (j + 1 == s.length()) {
                    System.out.print("-1 ");
                }
            }
        }
    }
}
