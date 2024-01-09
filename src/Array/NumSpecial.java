package Array;

public class NumSpecial {
    public static int numSpecial(int[][] mat) {

        int rows = mat.length;
        int cols = mat[0].length;

        int [] rowSum = new int[rows];
        int [] colSum  =new int[cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                 rowSum[i] += mat[i][j];
                 colSum[j] += mat[i][j];
            }
        }

        int specialPosition =0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (mat[i][j] == 1 && rowSum[i] == 1 && colSum[j]==1){
                    specialPosition++;
                }
            }
            }
        return specialPosition;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {0, 0, 1, 0},
                {0, 0, 0, 0},
                {0, 0, 0, 0},
                {0, 1, 0, 0}
        };

        int result = numSpecial(matrix);
        System.out.println(result);
    }
}
