package array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MaxIndex {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < 9; i++) {
            int n = scanner.nextInt();
            arrayList.add(n);

        }
        int max = Collections.max(arrayList);
        int index = arrayList.indexOf(max);

        System.out.println(max);
        System.out.println(index + 1);
    }
}
