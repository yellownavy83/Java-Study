package programmers.level3;

import java.util.Arrays;

public class NoOVertime {
    public int noOvertime(int no, int[] works) {

        int result = 0;

        while(true) {
            Arrays.sort(works);
            if (no > 0) {
                works[works.length - 1] -= 1;
                no--;
            } else {
                for (int i = 0 ; i < works.length ; i++) {
                    result += works[i] * works[i];
                }
                break;
            }
        }

        return  result;
    }

    public static void main(String[] args) {
        NoOVertime c = new NoOVertime();
        int []test = {4, 3, 3};
        System.out.println(c.noOvertime(4, test));
    }
}
