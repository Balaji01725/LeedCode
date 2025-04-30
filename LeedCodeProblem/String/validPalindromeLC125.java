package LeedCodeProblem.String;

public class validPalindromeLC125 {
    public static void main(String[] args) {
     String s="0 man,a plan,a canal:panam0";
        System.out.println(findPali(s));
    }
    static boolean findPali(String s){
        s=s.toLowerCase().replaceAll("[^A-Za-a0-9]","");
        int i=0;
        int j=s.length()-1;
        while(i<=j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
