package array;

import java.util.ArrayList;
import java.util.Scanner;

public class Average2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int c = scanner.nextInt();

        for (int i = 0; i < c; i++) {
            float student = scanner.nextFloat();
            ArrayList<Float> arrayList = new ArrayList<>();
            float cnt = 0;
            float sum = 0;
            float average = 0;
            for (int j = 0; j < student; j++) {
                arrayList.add(scanner.nextFloat());
                sum += arrayList.get(j);
            }
            average = sum / student;
            for (float score : arrayList) {
                if (score > average) {
                    cnt++;
                }
            }
            float round = (cnt / student) * 100;
            System.out.printf("%.3f", round);
            System.out.println("%");
        }
    }
}


