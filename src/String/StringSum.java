package String;

import java.util.Scanner;

public class StringSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        String string = scanner.next();
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += Integer.parseInt(string.substring(i, i + 1));
        }

        System.out.println(sum);
    }
}
