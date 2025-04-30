package LeedCodeProblem.String;

public class alternativelyMergeString {
    public static void main(String[] args) {
        String word1="abcd";
        String word2="qwe";
        System.out.println(findTheString(word1,word2));
    }
    static String findTheString(String word1,String word2){
        StringBuilder ans = new StringBuilder();
        int i=0;
        while(i<word1.length() || i<word2.length()){
            if(i<word1.length()){
                ans.append(word1.charAt(i));
            }
            if(i<word2.length()){
                ans.append(word2.charAt(i));
            }
            i++;
        }
        return ans.toString();
    }
}
