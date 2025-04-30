package LeedCodeProblem.String;

public class InSubsequence {
    public static void main(String[] args) {
    String str1="abc";
    String str2="ahcdg";
        System.out.println(findSub(str1,str2));
    }
    static boolean findSub(String str1,String str2){
        int i=0;
        int j=0;

        while(i<str1.length() && j<str2.length()){
            if(str1.charAt(i)==str2.charAt(j)){
                i++;
                j++;

            }
            else{
                j++;
            }
        }
        return (i==str1.length());
    }
}
