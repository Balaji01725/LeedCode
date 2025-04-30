package LeedCodeProblem.String;

public class anagramEfficient {
    public static void main(String[] args) {
    String s="peek";
    String t="keep";
    if(InAnagram(s,t)){
        System.out.println("This is Anagram String");
    }
    else{
        System.out.println("This is not a Anagram String");
    }
    }
    static boolean InAnagram(String s,String t){
        if(s.length()!=t.length()){
            return false;
        }

        int[] freq=new int[26];
        for(int i=0;i< s.length();i++){
            freq[s.charAt(i)-'a']++;
            freq[t.charAt(i)-'a']--;
        }
        for(int i=0;i<freq.length;i++){
            if(freq[i]!=0){
                return false;
            }
        }
        return true;
    }
}
