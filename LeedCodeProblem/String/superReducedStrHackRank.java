package LeedCodeProblem.String;

import java.util.Stack;
public class superReducedStrHackRank {
    public static void main(String[] args) {
        String str="abba";
        System.out.println(findReduceStr(str));
    }
    static String findReduceStr(String str){
        Stack<Character> st=new Stack<>();

        for(char c:str.toCharArray()){
            if(st.isEmpty()) st.push(c);
            else if(c==st.peek()) st.pop();
            else st.push(c);
        }
        StringBuilder ans=new StringBuilder();
        for(char c:st){
            ans.append(c);
        }
        return ans.isEmpty()? "Empty string":ans.toString();
    }
}
