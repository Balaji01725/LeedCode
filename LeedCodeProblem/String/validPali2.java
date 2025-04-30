package LeedCodeProblem.String;

public class validPali2 {
    public static void main(String[] args) {
        String s="malayallam";
        System.out.println(findPali(s));
    }
    static boolean findPali(String s){
        int l=0;
        int r=s.length()-1;
        while(l<r){
            if(s.charAt(l)==s.charAt(r)){
                l++;
                r--;
            }else{
                return checkPali(s,l+1,r)
                || checkPali(s,l,r-1);
            }
        }
        return true;
    }
    static boolean checkPali(String s,int l,int r){
        while(l<r){
            if(s.charAt(l)==s.charAt(r)){
                l++;
                r--;
            }else{
                return false;
            }
        }
        return true;
    }
}
