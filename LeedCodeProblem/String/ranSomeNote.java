package LeedCodeProblem.String;

public class ranSomeNote {
    public static void main(String[] args) {
        String magazine="aab";
        String ransomeNote="aa";
        System.out.println(findTheRansome(magazine,ransomeNote));

    }
    static boolean findTheRansome(String magazine,String ransomeNote){

        if(ransomeNote.length()>magazine.length()) return false;
        int[] freq=new int[26];
        for(char c:magazine.toCharArray()){
            freq[c-'a']++;
        }
        for(char c:ransomeNote.toCharArray()){
            freq[c-'a']--;
        }
        for(int i:freq){
            if(i<0) return false;
        }
        return true;
    }
}
