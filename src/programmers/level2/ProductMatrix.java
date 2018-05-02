package programmers.level2;

public class ProductMatrix {

    private int[][] productMatrix(int[][] A, int[][] B) {
        int[][] answer = new int[A.length][B[0].length];

        for (int i = 0; i < A.length; i++) {
            for (int j =0; j < B[0].length; j++) {
                answer[i][j] = 0;
                for (int x = 0; x < A[0].length; x++) {
                    answer[i][j] += A[i][x] * B[x][j];
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        ProductMatrix matrix = new ProductMatrix();
        int[][] a = { { 1, 2 }, { 2, 3 } };
        int[][] b = { { 3, 4 }, { 5, 6 } };
        // 아래는 테스트로 출력해 보기 위한 코드입니다.
        System.out.println("행렬의 곱셈 : " + matrix.productMatrix(a, b));
    }
}
