package strings;

import java.util.Stack;

public class ExpressionEval {
    public static void main(String[] args) {
        String s = "3+2*2";
        getSum(s);
        System.out.println(getSum(s));
    }

    public static int getSum(String s) {
        int num = 0;
        int result = 0;
        char sign = '+';

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                num = num * 10 + (s.charAt(i) - '0');
            }

            if (!Character.isDigit(s.charAt(i)) || i == s.length() - 1) {
                if (sign == '+') {
                    stack.push(num);
                } else if (sign == '-') {
                    stack.push(-num);
                } else if (sign == '*') {
                    stack.push(stack.pop() * num);
                }

                sign = s.charAt(i);
                num = 0;
            }
        }

        while (!stack.isEmpty()) {
            result += stack.pop();
        }

        return result;
    }
}
