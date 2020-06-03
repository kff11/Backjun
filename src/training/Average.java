package training;

import java.util.Scanner;

public class Average {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int result = 0;
        int sum = 0;

        for (int i = 0; i < 5; i++) {
            result = scanner.nextInt();
            if (result < 40) {
                sum += 40;
                continue;
            }
            sum += result;
        }

        System.out.println(sum / 5);
    }
}
