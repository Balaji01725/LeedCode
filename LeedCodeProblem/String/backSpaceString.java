package LeedCodeProblem.String;

public class backSpaceString {
    public static void main(String[] args) {
    String s="#abc";
    String t="#abc";
        System.out.println(findEquals(s,t));
    }
    static boolean findEquals(String s,String t){
        return findTheString(s).equals(findTheString(t));
    }
    static String findTheString(String str){
    StringBuilder ans=new StringBuilder();
    for(char c:str.toCharArray()){
        if(c=='#'){
            if(ans.length()>0){
                ans.deleteCharAt(ans.length()-1);
            }
        }
        else{
            ans.append(c);
        }
        }
    return ans.toString();
    }
}
