package training;

import java.util.Scanner;

public class Star {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
            if (i == n - 1) {
                for (int j = i; j > 0; j--) {
                    for (int k = 0; k < j; k++) {
                        System.out.print("*");
                    }
                    System.out.println("");
                }
            }

        }
    }
}
