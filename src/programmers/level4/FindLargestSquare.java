package programmers.level4;

//O와 X로 채워진 표가 있습니다.
//표 1칸은 1 x 1 의 정사각형으로 이루어져 있습니다.
//표에서 O로 이루어진 가장 큰 정사각형을 찾아 넓이를 반환하는 findLargestSquare 함수를 완성하세요. 예를 들어
//
//1	2	3	4	5
//X	O	O	O	X
//X	O	O	O	O
//X	X	O	O	O
//X	X	O	O	O
//X	X	X	X	X
//가 있다면 정답은
//
//1	2	3	4	5
//X	O	O	O	X
//X	O	O	O	O
//X	X	O	O	O
//X	X	O	O	O
//X	X	X	X	X
//가 되며 넓이는 9가 되므로 9를 반환해 주면 됩니다.

public class FindLargestSquare {
    private int findLargestSquare(char[][] board) {
        int answer = 0;

        int width = board.length;
        int height = board[0].length;
        for (int i = 0 ; i < width ; i++) {
            for (int j = 0 ; j < height ; j++) {
                if (board[i][j] == 'X') continue;

                int k = 1;
                while (true) {
                    if (k + i >= width || k + j >= height) break;

                    boolean flag = true;
                    for (int l = 0 ; l <= k ; l++) {
                        for (int m = 0 ; m <= k ; m++) {
                            if (board[i + l][j + m] == 'X') {
                                flag = false;
                                break;
                            }
                        }
                        if (!flag) {
                            break;
                        }
                    }
                    if (flag) {
                        answer = Math.max(answer, (k + 1) * (k + 1));
                    } else {
                        break;
                    }
                    k++;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args)
    {
        FindLargestSquare test = new FindLargestSquare();
        char [][]board ={
                {'X','O','O','O','X'},
                {'X','O','O','O','O'},
                {'X','X','O','O','O'},
                {'X','X','O','O','O'},
                {'X','X','X','X','X'}};

        System.out.println(test.findLargestSquare(board));
    }
}
