package BitManuplation;

public class NumberOfOneBits {

        public static int hammingWeight(int n){


            int count = 0;

            for (int i =0; i < 32; i++){
                if(((n >> i) & 1) == 1 ){
                    count += 1;
                }
            }
            return count;

//            int count = 0;
//
//            String binaryString =  Integer.toBinaryString(n);
//
//            for (char i : binaryString.toCharArray()){
//                int bitValue = Character.getNumericValue(i);
//
//                if (bitValue == 1) count++;
//            }
//
//            return count;
        }

    public static void main(String[] args) {
        int n = 00000000000000000000011000001011;
        System.out.println(hammingWeight(n));
    }
}
