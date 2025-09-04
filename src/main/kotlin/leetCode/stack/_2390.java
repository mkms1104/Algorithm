package leetCode.stack;

import java.util.Stack;

public class _2390 {
    public static void main(String[] args) {
        String output = new _2390().removeStars("erase*****");
        System.out.println(output);
    }

    public String removeStars(String s) {
        Stack<String> stack = new Stack<>();

        for(char sChar : s.toCharArray()) {
            if(sChar == '*') stack.pop();
            else stack.push(String.valueOf(sChar));
        }

        return String.join("", stack);
    }
}
