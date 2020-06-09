package String;

import java.util.HashMap;
import java.util.Scanner;

public class WordStudy {
    static int prevalue = 1;
    static int ascii;
    static char result;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 65; i <= 90; i++) {
            hashMap.put(i, 0);
        }

        String string = scanner.next();
        if (string.length() == 1) {
            System.out.println(string.toUpperCase());
        } else {
            for (int i = 0; i < string.length(); i++) {
                for (int j = 97; j <= 122; j++) {
                    if ((int) string.charAt(i) == j) {
                        int cnt = hashMap.get(j - 32) + 1;
                        hashMap.put(j - 32, cnt);
                    }
                }
                for (int j = 65; j <= 90; j++) {
                    if ((int) string.charAt(i) == j) {
                        int cnt = hashMap.get(j) + 1;
                        hashMap.put(j, cnt);
                    }
                }
            }
            hashMap.forEach((key, value)
                    -> {
                if (value > prevalue) {
                    prevalue = value;
                    ascii = key;
                    result = (char) ascii;
                } else if (value == prevalue) {
                    result = '?';
                }
            });

            System.out.print(result);
        }
    }
}
