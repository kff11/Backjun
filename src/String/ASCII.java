package String;

import java.util.Scanner;

public class ASCII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char text = scanner.next().charAt(0);
        int code = (int) text;

        System.out.println(code);
    }
}
