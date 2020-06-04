package array;

import java.util.ArrayList;
import java.util.Scanner;

public class OXQuiz {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        ArrayList<String> arrayList = new ArrayList<>();

        for (int i = 0; i < num; i++) {
            arrayList.add(scanner.next());
        }

        for (int i = 0; i < num; i++) {
            String result = arrayList.get(i);
            int sum = 0;
            int cnt = 0;
            for (int j = 0; j < result.length(); j++) {
                if (result.charAt(j) == 'O') {
                    cnt++;
                    sum += cnt;
                } else {
                    cnt = 0;
                }
            }
            System.out.println(sum);
        }
    }
}
