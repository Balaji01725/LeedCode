package LeedCodeProblem.String;

public class frequencyMethodAnagram {
    public static void main(String[] args) {
        String str1="abcde";
        String str2="baced";
        System.out.println(findAnagramWord(str1,str2));
    }
    static boolean findAnagramWord(String str1,String str2){
        if(str1.length()!=str2.length()){
            return false;
        }
        int[] freq=new int[26];
        for(int i=0;i<str1.length();i++){
            freq[str1.charAt(i)-'a']++;
        }
        for(int i=0;i<str2.length();i++){
            freq[str2.charAt(i)-'a']--;
        }
        for(int i=0;i<26;i++){
            if(freq[i]!=0){
                return false;
            }
        }
        return true;
    }
}
