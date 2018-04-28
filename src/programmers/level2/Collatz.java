package programmers.level2;

public class Collatz {

    public int collatz(int num) {
        int answer = 0;

        long value = num;
        while (true) {
            if (value % 2 == 0) {
                value /= 2;
            } else {
                value = value * 3 + 1;
            }
            answer++;
            if (value == 1) {
                break;
            }
            if (answer == 500) {
                answer = -1;
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Collatz c = new Collatz();
        int ex = 1126015;
        System.out.println(c.collatz(ex));
    }
}
