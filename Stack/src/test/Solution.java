package test;

import java.util.Stack;

public class Solution {

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            if (c == '(' || c == '{' || c == '[')
                stack.push(c);
            else {
                if (stack.isEmpty())
                    return false;

                Character topChar = stack.pop();
                if (topChar == '(' && c != ')')
                    return false;
                if (topChar == '{' && c != '}')
                    return false;
                if (topChar == '[' && c != ']')
                    return false;
            }
        }
        return stack.isEmpty();

    }

    public static void main(String[] args) {

        Solution solution = new Solution();
        System.out.println(solution.isValid("(]"));

    }
}