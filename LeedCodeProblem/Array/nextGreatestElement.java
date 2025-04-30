package LeedCodeProblem.Array;

import java.util.Stack;
public class nextGreatestElement {
    public static void main(String[] args) {
        int[] arr={4,6,8,1,2,3,5};
        int n=arr.length;
        int[] nge=new int[n];
        Stack<Integer> st=new Stack<>();
        for(int i=n-1;i>=0;i--){
            nge[i]=findNGE(st,arr[i]);
            st.push(arr[i]);
        }
        for(int i:nge){
            System.out.print(i + " ");
        }
    }
    static int findNGE(Stack<Integer> st,int num){

        while(!st.isEmpty() && st.peek() <= num){
            st.pop();
        }
        if(st.isEmpty()){
            return -1;
        }
        return st.peek();
    }
}
