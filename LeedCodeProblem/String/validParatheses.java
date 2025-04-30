package LeedCodeProblem.String;

import java.util.Stack;

public class validParatheses {
    public static void main(String[] args) {
        String str="()";
        System.out.println(InValid(str));
    }
    static boolean InValid(String str){
        Stack<Character> st = new Stack<>();
        for (char c : str.toCharArray()) {
            if (c == '(') {
                st.push(')');
            }
            else if (c == '{') {
                st.push('}');
            }
            else if (c == '[') {
                st.push(']');
            }
            else if (st.pop() != c || st.isEmpty()) {
                return false;
            }
        }
        return st.isEmpty();
    }
}
