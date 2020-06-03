package array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Average {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            arrayList.add(scanner.nextInt());
        }
        float max = Collections.max(arrayList);
        float sum = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            float score =  Float.valueOf(arrayList.get(i)) / max * 100;
            sum += score;
        }
        System.out.println(sum / n);
    }
}
