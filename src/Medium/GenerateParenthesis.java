package Medium;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GenerateParenthesis {

    /*
            Using a backtracking method
     */
//    public static List<String> generateParenthesis(int n) {
//
//        List<String> list  = new ArrayList<>();
//        backtracking(list,"",0,0,n);
//        return list;
//    }
//    public static void backtracking(List<String> list, String str, int open, int close, int max) {
//
//        if(str.length() == max * 2 ) {
//            list.add(str);
//            return;
//        }
//
//        if(open < max) backtracking(list,str+"(", open + 1, close, max);
//        if(close < open) backtracking(list, str+ ")", open, close +1, max);
//    }

    /*
            Using Stack
     */

    public static List<String> generateParenthesis(int n){

        Stack stack = new Stack();
        List<String> result = new ArrayList<>();
        backtracking(result, stack, n,0,0);
        return result;
    }

    public static void backtracking(List<String> list, Stack<Character> stack, int n, int open, int close){
//        if (open == close && close == n) {
//            list.add(buildString(stack));
//        }

        if(stack.size() == n *2) {
            list.add(buildString(stack));
        }

        if(open < n) {
            stack.push('(');
            backtracking(list,stack,n, open +1, close);
            stack.pop();
        }

        if (close < open) {
            stack.push(')');
            backtracking(list,stack, n, open, close + 1);
            stack.pop();
        }
    }

    private static String buildString(Stack<Character> stack) {
        StringBuilder sb = new StringBuilder();
        for(Character c: stack){
            sb.append(c);
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(generateParenthesis(1));
    }
}
