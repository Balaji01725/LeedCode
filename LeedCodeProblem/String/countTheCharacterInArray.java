package LeedCodeProblem.String;

public class countTheCharacterInArray {
    public static void main(String[] args) {
        String str="Hello java";
        int count =0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=' '){
                count++;
            }
        }
        System.out.println("count the character of the strings are:"+count);
    }
}
