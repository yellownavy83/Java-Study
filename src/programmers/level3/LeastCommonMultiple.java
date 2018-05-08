package programmers.level3;

import java.util.Arrays;

//두 수의 최소공배수(Least Common Multiple)란 입력된 두 수의 배수 중 공통이 되는 가장 작은 숫자를 의미합니다.
//예를 들어 2와 7의 최소공배수는 14가 됩니다.
//정의를 확장해서, n개의 수의 최소공배수는 n 개의 수들의 배수 중 공통이 되는 가장 작은 숫자가 됩니다.
//nlcm 함수를 통해 n개의 숫자가 입력되었을 때, 최소공배수를 반환해 주세요.
//예를들어 [2,6,8,14] 가 입력된다면 168을 반환해 주면 됩니다.

public class LeastCommonMultiple {

    private long nlcm(int[] num) {
        long answer;

        long temp = lcm(num[0], num[1]);
        for (int i = 2; i < num.length; i++) {
            temp = lcm(temp, num[i]);
        }
        answer = temp;
        return answer;
    }

    private long lcm(long a, long b) {
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
