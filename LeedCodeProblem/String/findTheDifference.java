package LeedCodeProblem.String;

public class findTheDifference {
    public static void main(String[] args) {
     String s="abcd";
     String t="abcde";
        System.out.println(differenceBetweenTheCharacter(s,t));
    }
    static char differenceBetweenTheCharacter(String s,String t){
        int total=0;
        for(int i=0;i<t.length();i++){
            total+=t.charAt(i);
        }
        for(int i=0;i<s.length();i++){
            total-=s.charAt(i);
        }

        return (char)total;
    }
}
