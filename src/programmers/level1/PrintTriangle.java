package programmers.level1;

public class PrintTriangle {

    public String printTriangle(int num) {
        String answer = "";
        String star = "*";
        for (int i = 0 ; i < num ; i++) {
            answer += star +"\n";
            star += "*";
        }

        return answer;
    }

    public static void main(String[] args) {
        PrintTriangle pt = new PrintTriangle();
        System.out.println( pt.printTriangle(3));
    }
}
