package Method;

import java.util.Scanner;

public class Aberration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int cnt = 0;

        if (n < 100) {
            System.out.println(n);
        } else {
            cnt = 99;
            for (int i = 100; i <= n; i++) {
                int hun = i / 100;
                int ten = i / 10 % 10;
                int one = i % 10;
                if (one - ten == ten - hun) {
                    cnt++;
                }
            }
            System.out.println(cnt);

        }
    }
}
