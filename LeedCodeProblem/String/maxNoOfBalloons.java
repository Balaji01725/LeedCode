package LeedCodeProblem.String;

public class maxNoOfBalloons {
    public static void main(String[] args) {
        String str="ebawllioonh";
        System.out.println(findTheMaximum(str));
    }
    static int findTheMaximum(String str){
        int[] freq=new int[26];
        for(char c:str.toCharArray()){
            freq[c-'a']++;
        }
        char[] balloon=new char[] {'b','a','l','o','n'};
        int minFreq=Integer.MAX_VALUE;
        for(char c:balloon){
            if(c=='l' || c=='o'){
                freq[c-'a']=freq[c-'a']/2;
            }
            minFreq=Math.min(freq[c-'a'],minFreq);
        }
        return minFreq==Integer.MAX_VALUE?0:minFreq;
    }
}
