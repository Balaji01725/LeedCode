package LeedCodeProblem.String;

public class expandTheCompressString {
    public static void main(String[] args) {
        String str="3a4v5b";
        System.out.println(findExpandString(str));
    }
    static String findExpandString(String str){
        int i=0;
        StringBuilder ans=new StringBuilder();
        while(i<str.length()){
            char currentChar=str.charAt(i);
            int repeat=0;
            i++;
            while(i<str.length() && Character.isDigit(str.charAt(i))){
                repeat=(repeat*10)+str.charAt(i)-'0';
                i++;
            }
            for(int j=0;j<repeat;j++){
                ans.append(currentChar);
            }
        }
        return ans.toString();
    }
}
