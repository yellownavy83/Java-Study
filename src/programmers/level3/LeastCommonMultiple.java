package programmers.level3;

import java.util.Arrays;

public class LeastCommonMultiple {

    public long nlcm(int[] num) {
        long answer = 0;

        long temp = lcm(num[0], num[1]);
        for (int i = 2; i < num.length; i++) {
            temp = lcm(temp, num[i]);
        }
        answer = temp;
        return answer;
    }

    public long lcm(long a, long b) {
        long big, small;
        long mok, na;
        long gcm, lcm;

        if (a > b) {
            big = a;
            small = b;
        } else {
            big = b;
            small = a;
        }
        while (true) {
            mok = big / small;
            na = big % small;

            if (na == 0) {
                gcm = small;
                lcm = (a * b) / gcm;
                break;
            }
            big = small;
            small = na;
        }
        return lcm;
    }

    public static void main(String[] args) {
        LeastCommonMultiple c = new LeastCommonMultiple();
        int[] ex = { 16, 58, 95, 4, 14, 14, 86, 87, 26, 19 };
        // 아래는 테스트로 출력해 보기 위한 코드입니다.
        System.out.println(c.nlcm(ex));
    }
}
