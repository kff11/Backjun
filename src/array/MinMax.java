package array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        ArrayList arrayList = new ArrayList();

        for (int i = 0; i < n; i++) {
            arrayList.add(scanner.nextInt());
        }
        Collections.sort(arrayList);

        System.out.print(arrayList.get(0) + " " + arrayList.get(arrayList.size() - 1));
    }
}
