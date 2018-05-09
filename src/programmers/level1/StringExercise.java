package programmers.level1;

//getMiddle메소드는 하나의 단어를 입력 받습니다.
//단어를 입력 받아서 가운데 글자를 반환하도록 getMiddle메소드를 만들어 보세요.
//단어의 길이가 짝수일경우 가운데 두글자를 반환하면 됩니다.
//예를들어 입력받은 단어가 power이라면 w를 반환하면 되고, 입력받은 단어가 test라면 es를 반환하면 됩니다.

public class StringExercise {

    private String getMiddle(String word) {
        String[] buffer = word.split("");
        int length = buffer.length;
        int center = buffer.length / 2;

        String answer = "";
        if (length % 2 == 0) {
            answer = buffer[center-1] + buffer[center];
        } else {
            answer = buffer[center];
        }

        return answer;
    }

    public static void main(String[] args) {
        StringExercise stringExercise = new StringExercise();
        System.out.println(stringExercise.getMiddle("power"));
    }
}
