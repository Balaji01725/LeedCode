package LeedCodeProblem.String;

public class countTheNumberVowelsInStringRange {
    public static void main(String[] args) {
        String[] str={"are","amy","u","i","o","f"};
        int left=0;
        int right=str.length-1;
        System.out.println(findTheVowelsInString(str,left,right));
    }
    static int findTheVowelsInString(String[] str,int left,int right){
        int count=0;
        for(int i=left;i<=right;i++){
            int s=str[i].charAt(0);
            int e=str[i].charAt(str[i].length()-1);
            if(s=='a'||s=='e'||s=='i'||s=='o'||s=='u'){
                if(e=='a'||e=='e'||e=='i'||e=='o'||e=='u'){
                    count++;
                }
            }
        }
        return count;
    }
}
