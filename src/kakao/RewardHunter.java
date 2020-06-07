package kakao;

import java.util.ArrayList;
import java.util.Scanner;

public class RewardHunter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] first = {0, 5000000, 3000000, 2000000, 500000, 300000, 100000};
        int[] second = {0, 5120000, 2560000, 1280000, 640000, 320000};

        ArrayList<int[]> arrayList = new ArrayList<>();
        int t = scanner.nextInt();

        for (int i = 0; i < t; i++) {
            int[] ab = {scanner.nextInt(), scanner.nextInt()};
            arrayList.add(ab);
        }

        for (int i = 0; i < t; i++) {
            int sum = 0;
            int rank = 1;
            int cnt = 1;
            int person = 1;
            while (true) {
                if (arrayList.get(i)[0] <= 0) {
                    sum += 0;
                    break;
                } else if (arrayList.get(i)[0] <= person) {
                    if (rank >= 7) {
                        sum += 0;
                    } else {
                        sum += first[rank];
                    }
                    break;
                } else {
                    cnt++;
                    person += cnt;
                    rank++;
                }
            }
            rank = 1;
            cnt = 1;
            person = 1;
            while (true) {
                if (arrayList.get(i)[1] <= 0) {
                    sum += 0;
                    break;
                } else if (arrayList.get(i)[1] <= person) {
                    if (rank >= 6) {
                        sum += 0;
                    } else {
                        sum += second[rank];
                    }
                    break;
                } else {
                    cnt *= 2;
                    person += cnt;
                    rank++;
                }
            }
            System.out.println(sum);

        }
        scanner.close();
    }
}
