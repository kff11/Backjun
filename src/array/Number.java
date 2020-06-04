package array;

import java.util.Scanner;

public class Number {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        String multiply = String.valueOf(a * b * c);

        for (int i = 0; i <= 9; i++) {
            int cnt = 0;
            for (int j = 0; j < multiply.length(); j++) {
                if(multiply.charAt(j) == Character.forDigit(i, 10)){
                    cnt++;
                }
            }
            System.out.println(cnt);
        }


    }
}
