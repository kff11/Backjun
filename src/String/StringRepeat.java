package String;

import java.util.Scanner;

public class StringRepeat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int r = scanner.nextInt();
            String s = scanner.next();
            for (int j = 0; j < s.length(); j++) {
                for (int k = 0; k < r; k++) {
                    System.out.print(s.substring(j, j + 1));
                }
            }
            System.out.println();
        }
    }
}
