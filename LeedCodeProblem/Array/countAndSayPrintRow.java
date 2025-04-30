package LeedCodeProblem.Array;

public class countAndSayPrintRow {
    public static void main(String[] args) {
        String str="1";
        System.out.println(str);
        for(int i=1;i<4;i++){
            str=findTheRow(str);
            System.out.println(str);
        }
//        System.out.println(str);
    }
    static String findTheRow(String str){
        StringBuilder ans=new StringBuilder();
        int count=1;
        char currChar=str.charAt(0);

        for(int i=1;i<str.length();i++){
            char nextChar=str.charAt(i);

            if(currChar==nextChar){
                count++;
            }else{
                ans.append(count).append(currChar);
                count=1;
                currChar=nextChar;
            }
        }
        ans.append(count).append(currChar);
        return ans.toString();
    }
}
