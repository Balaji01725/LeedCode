package LeedCodeProblem.String;

public class countTheNoOfSubStrings {
    public static void main(String[] args) {
        String str="abcabc";
        System.out.println(countTheSubString(str));
    }
    static int countTheSubString(String str){
        int n=str.length();
        int[] verify=new int[n];
        for(int i=0;i<n;i++){
            verify[i]=-1;
        }
        int count=0;
        for(int i=0;i<n;i++){
            verify[str.charAt(i)-'a']=i;
            count=count+(1+Math.min(Math.min(verify[0],verify[1]),verify[2]));
        }
        return count;
    }
}
