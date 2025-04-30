package LeedCodeProblem.Array;

public class countAndSay1 {
    public static void main(String[] args) {
        String str="1";
        System.out.println(str);
        for(int i=1;i<5;i++){
            str=count(str);
            System.out.println(str);
        }

    }
    static String count(String str){
        int count=1;
        char currChar=str.charAt(0);
        StringBuilder ans =new StringBuilder();
        for(int i=1;i<str.length();i++){
            char nextChar=str.charAt(i);
            if(currChar==nextChar){
                count++;
            }
            else{
                ans.append(count).append(currChar);
                currChar=nextChar;
                count=1;
            }
        }
        ans.append(count).append(currChar);
        return ans.toString();
    }
}
