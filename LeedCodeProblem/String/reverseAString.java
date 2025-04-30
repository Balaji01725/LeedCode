package LeedCodeProblem.String;

public class reverseAString {
    public static void main(String[] args) {
        String s="INTERVIEW";
        char ch[]=s.toCharArray();
        for(int i=ch.length-1;i>=0;i--){
            System.out.print(ch[i] +" ");
        }
    }
}
