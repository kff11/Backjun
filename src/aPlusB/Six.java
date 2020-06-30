package aPlusB;

import java.util.Scanner;

public class Six {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            String n = scanner.next();
            String[] result = n.split(",");
            int a = Integer.parseInt(result[0]);
            int b = Integer.parseInt(result[1]);
            System.out.println(a + b);
        }
    }
}
