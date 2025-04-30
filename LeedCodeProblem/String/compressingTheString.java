package LeedCodeProblem.String;

public class compressingTheString {
    public static void main(String[] args) {
        String str="aaaaaabbbbbbbbbbbmmmmmmmmmmmmttttttttt";
        System.out.println(setComprose(str));

    }
    static  String setComprose(String str){
        char currentChar=str.charAt(0);
        int count=1;
        StringBuilder ans=new StringBuilder();
        for(int i=1;i<str.length();i++){
            char nextChar=str.charAt(i);
            if(currentChar==nextChar){
                count++;
            }
            else{
                ans.append(count).append(currentChar);
                currentChar=nextChar;
                count=1;
            }
        }
        ans.append(count).append(currentChar);
        return ans.toString();
    }
}
