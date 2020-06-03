package training;

import java.util.Scanner;

public class Mcdonald {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sangduk = scanner.nextInt();
        int jungduk = scanner.nextInt();
        int haduk = scanner.nextInt();
        int coke = scanner.nextInt();
        int sidar = scanner.nextInt();

        int[] burger = {sangduk, jungduk, haduk};
        int[] drink = {coke, sidar};

        int result = 99999;

        for (int i = 0; i < burger.length; i++) {
            for (int j = 0; j < drink.length; j++) {
                int setMenu = burger[i] + drink[j] - 50;
                if (setMenu < result) {
                    result = setMenu;
                }
            }
        }

        System.out.println(result);
    }
}
