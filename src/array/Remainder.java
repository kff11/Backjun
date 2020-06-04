package array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Remainder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        List<Integer> removeOverlap = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(scanner.nextInt() % 42);
        }

        for(int data : list){
            if(!removeOverlap.contains(data)){
                removeOverlap.add(data);
            }
        }

        System.out.println(removeOverlap.size());
    }
}
