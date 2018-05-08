package programmers.level2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//reverseInt 메소드는 int형 n을 매개변수로 입력받습니다.
//n에 나타나는 숫자를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요.
//예를들어 n이 118372면 873211을 리턴하면 됩니다.
//n은 양의 정수입니다.

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
        StringBuilder answer = new StringBuilder();
        for (int element : al) {
            answer.append(element);
        }
        return Integer.parseInt(answer.toString());
    }

    public static void main(String args[]) {
        ReverseInt ri = new ReverseInt();
        System.out.println(ri.reverseInt(118372));
    }
}
