package Method;

import java.util.ArrayList;

public class SelfNumber {

    static int d(int n){
        int result = n;

        String nStr = Integer.toString(n);

        for (int i = 0; i < nStr.length(); i++) {
            result += Integer.parseInt(nStr.substring(i, i + 1));
        }

        return result;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 1; i <= 10000; i++) {
            arrayList.add(d(i));
        }

        for (int i = 1; i <= 10000; i++) {
            if(!arrayList.contains(i)){
                System.out.println(i);
            }
        }

    }
}
