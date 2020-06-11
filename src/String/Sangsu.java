package String;

import java.util.Scanner;

public class Sangsu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String a = scanner.next();
        String b = scanner.next();

        String A = "";
        String B = "";

        for (int i = 2; i >= 0; i--) {
            A += a.charAt(i);
            B += b.charAt(i);
        }

        if(Integer.parseInt(A) < Integer.parseInt(B)){
            System.out.println(B);
        } else {
            System.out.println(A);
        }
    }
}
