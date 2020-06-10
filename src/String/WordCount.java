package String;

import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String string = scanner.nextLine();
        String[] words = string.split(" ");
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            if(!words[i].isEmpty()){
                count++;
            }
        }

        System.out.println(count);
    }
}
