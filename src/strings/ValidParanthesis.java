package strings;

import java.util.Stack;

public class ValidParanthesis {
    public boolean checkValidString(String s) {
        Stack<Character> st = new Stack<>();
        for (char chars : s.toCharArray()) {
            if (chars == '{' || chars == '(' || chars == '[') {
                st.push(chars);
            } else if (chars == '}' || chars == ')' || chars == ']') {
                if (st.isEmpty()) {
                    return false;
                }
                char top = st.pop();
                if (chars == ')' && top != '(' || chars == '}' && top != '{' || chars == '[' && top != ']') {
                    return false;
                }
            }
        }

        return st.isEmpty();
    }

    public static void main(String[] args) {
        ValidParanthesis obj = new ValidParanthesis();
        System.out.println(obj.checkValidString("()[]{}"));
    }
}
