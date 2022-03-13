import java.util.Arrays;

public class the2dArrays {
    public static void main(String[] args) {
        char[][] board = new char[3][3];
        for (int i = 0;i<3;i++) {
            for(int j = 0;j<3;j++){
                board[i][j] = '-';
            }
        }
        char[][] boardTwo = new char[][]{
                new char[] {'0','-','2'},
                new char[] {'3','-','5'},
                new char[] {'6','-','7'}
        };
        board[0][0] = 'O';
        board[1][0] = 'O';
        board[2][0] = 'O';
        System.out.println(Arrays.deepToString(board));
        System.out.println(Arrays.deepToString(boardTwo));

    }
}
