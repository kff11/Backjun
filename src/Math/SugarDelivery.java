package Math;

import java.util.Scanner;

public class SugarDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int count = 0;

        while (n > 0) {
            if (n >= 5 && (n % 5 == 3 || n % 5 == 0)) {
                count++;
                n -= 5;
            } else if(n >= 3){
                count++;
                n -= 3;
            } else {
                count = -1;
                break;
            }
        }
        System.out.println(count);
    }
}
