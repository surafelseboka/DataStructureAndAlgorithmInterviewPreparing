package DynamicProgramming.houseRobber;

public class RobRecursive {

      /*
            i. if rob (i) - can't rob previous (i -1) - so solve (i-2)
            ii. if not robbed - can be robbed the adjacent house (i-1)

           Will Time Limit Exceeded
           So better find an optimized way
      */

    public static int rob(int[] num) {
      return rob(num, num.length -1);
    }
    public static int rob(int[] num, int i) {

        if(i < 0) return 0;

        return Math.max(rob(num, i-2) + num[i], rob(num, i-1));
    }

    public static void main(String[] args) {
        System.out.println(rob(new int[] {2,7,9,3,1}));
    }
}
