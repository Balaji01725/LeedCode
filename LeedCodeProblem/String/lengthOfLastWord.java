package LeedCodeProblem.String;

public class lengthOfLastWord {
    public static void main(String[] args) {
        String s=" i like the beautiful moon  ";
        System.out.println(findTheLength(s));
    }
    static int findTheLength(String s){
        String str=s.trim();
        int count=0;
        for(int i=str.length()-1;i>=0;i--){
            if(str.charAt(i)!=' '){
                count++;
            }
            else{
                break;
            }
        }
        return count;
    }
}
