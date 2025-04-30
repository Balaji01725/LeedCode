package LeedCodeProblem.String;

public class removeSpaces151 {
    public static void main(String[] args) {
        String str="  the sky is blue  ";
        System.out.println(findTheReverseString(str));
    }
    static String findTheReverseString(String str){

        String[] words=str.split(" +");
        StringBuilder ans=new StringBuilder();
        for(int i=words.length-1;i>=0;i--){
            ans.append(words[i]);
            ans.append(" ");
        }
        return ans.toString().trim();
    }
}
