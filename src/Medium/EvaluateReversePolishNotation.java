package Medium;

import java.util.Stack;

public class EvaluateReversePolishNotation {
    public static int evalRPN(String[] tokens) {

        Stack stack = new Stack<>();

        for (String s : tokens) {
            if( !s.equals("+") && !s.equals("-") && !s.equals("/") && !s.equals("*")){
                stack.push(s);
            } else {

                int operandOne = Integer.parseInt((String) stack.pop());
                int operandTwo = Integer.parseInt((String) stack.pop());

                if (s.equals("+")) {
                    int i = operandTwo + operandOne;
                    stack.push(Integer.toString(i));
                } else if (s.equals("-")) {
                    int i = operandTwo - operandOne;
                    stack.push(Integer.toString(i));
                } else if (s.equals("*")) {
                    int i = operandTwo * operandOne;
                    stack.push(Integer.toString(i));
                } else {
                    if (operandOne == 0) {
                        stack.push(Integer.toString(0));
                    } else {
                        int i = operandTwo / operandOne;
                        stack.push(Integer.toString(i));
                    }
                }
            }
        }
            return Integer.parseInt((String) stack.pop());
    }


    public static void main(String[] args) {
        System.out.println(evalRPN(new String[] {"10","6","9","3","+","-11","*","/","*","17","+","5","+"}));
    }
}
