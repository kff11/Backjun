package String;

import java.util.Scanner;

public class Dial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.next();
        int time = 0;
        for (int i = 0; i < word.length(); i++) {
            int ascii = (int) word.charAt(i);
            if (ascii < 68) {
                time += 3;
            } else if (ascii < 71) {
                time += 4;
            } else if (ascii < 74) {
                time += 5;
            } else if (ascii < 77) {
                time += 6;
            } else if (ascii < 80) {
                time += 7;
            } else if (ascii < 84) {
                time += 8;
            } else if (ascii < 87) {
                time += 9;
            } else if (ascii < 91) {
                time += 10;
            } else if (ascii < 95) {
                time += 11;
            } else {
                time += 2;
            }
        }
        System.out.println(time);
    }
}
