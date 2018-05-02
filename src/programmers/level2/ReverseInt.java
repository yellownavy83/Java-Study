package programmers.level2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ReverseInt {
    private int reverseInt(int n) {

        String[] temp = Integer.toString(n).split("");
        ArrayList<Integer> al = new ArrayList<>();
        for (String aTemp : temp) {
            al.add(Integer.parseInt(aTemp));
        }
        Comparator<Integer> co = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        };
        Collections.sort(al, co);
        String answer = "";
        for (int element : al) {
            answer += element;
        }
        return Integer.parseInt(answer);
    }

    public static void main(String args[]) {
        ReverseInt ri = new ReverseInt();
        System.out.println(ri.reverseInt(118372));
    }
}
