package Math;

import java.util.Scanner;

public class FindFraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int line = 0;
        int cnt = 0;
        while (cnt < x) {
            line++;
            cnt = line * (line + 1) / 2;
        }
        if (line % 2 != 0) {
            int top = 1 + (cnt - x);
            int bottom = line - (cnt - x);
            System.out.println(top + "/" + bottom);
        } else {
            int top = line - (cnt - x);
            int bottom = 1 + (cnt - x);
            System.out.println(top + "/" + bottom);
        }
    }
}
