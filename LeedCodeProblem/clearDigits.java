package LeedCodeProblem;

import java.util.*;

public class clearDigits {
    public static void main(String[] args) {
        String s="qw12";
        String ans=toGetDigits(s);
        System.out.println(ans);
    }
    static String toGetDigits(String s){
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++){
            if(Character.isDigit(s.charAt(i))){
                st.pop();
                continue;
            }
            else{
                st.push(s.charAt(i));
                continue;
            }
        }
        StringBuilder sb=new StringBuilder();
        while(!st.empty()){
            sb.insert(0,st.pop());
        }
        return sb.toString();
    }
}
