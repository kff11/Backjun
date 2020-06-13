package Math;

import java.util.Scanner;

public class Honeycomb {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int i = 0;
        int room = 1;
        int count = 1;
        while (true) {
            if (n > room) {
                i += 6;
                room += i;
                count++;
            } else {
                break;
            }
        }
        System.out.println(count);
    }
}
