package Math;

import java.util.Scanner;

public class Snail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int v = scanner.nextInt();
        int answer = 1;
        int subValue = a - b;
        v -= a;
        int share = v / subValue;

        if(v - (subValue * share) <= 0){
            answer += share;
        } else {
            answer += share + 1;
        }

        System.out.println(answer);
    }
}
