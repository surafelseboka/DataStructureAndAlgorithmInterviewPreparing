package Matrix;

public class TwoDMatrix {

    public static void matrix(int[][] val){

        for (int i=0; i < 3; i++){
            for (int j = 0; j < 4 ; j++) {
                System.out.print(val[i][j] +" ");
            }
            System.out.println();
        }

        System.out.println(val[0].length);

    }

    public static void main(String[] args) {
        int[][] val = new int[3][4];
        val[0][0] =  1;
        val[0][1] =  3;
        val[0][2] =  5;
        val[0][3] =  7;
        val[1][0] =  10;
        val[1][1] =  11;
        val[1][2] =  16;
        val[1][3] =  20;
        val[2][0] =  23;
        val[2][1] =  30;
        val[2][2] =  34;
        val[2][3] =  60;

         matrix(val);
    }
}
