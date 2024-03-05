package Matrix;

public class TwoDMatrix {

    public static void matrix(Character[][] val){

        for (int i=0; i < 3; i++){
            for (int j = 0; j < 4 ; j++) {
                System.out.print(val[i][j] +" ");
            }
            System.out.println();
        }

       // System.out.println(val[0].length);

    }

    public static void main(String[] args) {
        Character[][] val = new Character[3][3];

        int rows =  val.length;
        int column = val[0].length;
        val[0][0] =  'A';
        val[0][1] =  'B';
        val[0][2] =  'C';
//        val[0][3] =  'E';
        val[1][0] =  'S';
        val[1][1] =  'F';
        val[1][2] =  'C';
//        val[1][3] =  'S';
        val[2][0] =  'A';
        val[2][1] =  'D';
        val[2][2] =  'E';
//        val[2][3] =  'E';

//         matrix(val);
        System.out.println(rows);
        System.out.println(column);

        for (int i=0; i< rows; i++){
            for (int j=0; j < column; j++){
                System.out.print(val[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("new matrix ");

        for (int i=val.length; i >=0; i-- ){
            for (int j=val[0].length; j>=0; j--){
                System.out.print(val[j][i] + "");
            }
            System.out.println();
        }
    }
}
