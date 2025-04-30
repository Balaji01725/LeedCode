package LeedCodeProblem.String;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
public class sheralockValidStrHackRank {
    public static void main(String[] args) {
        String str="aabbccdddd";
        System.out.println(findValidString(str));
    }
    static String findValidString(String str){
        Map<Character,Integer> charFreqMap=new HashMap<>();
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            int freq=charFreqMap.getOrDefault(c,0);
            charFreqMap.put(c,++freq);
        }
        int[] arr=new int[charFreqMap.size()];
        int index=0;
        for(Map.Entry<Character,Integer> characterIntegerEntry:charFreqMap.entrySet()){
            arr[index++]=characterIntegerEntry.getValue();
        }
        Arrays.sort(arr);

        if(charFreqMap.size()==1) return "yes";

        int first=arr[0];
        int second=arr[1];
        int secondLast=arr[arr.length-2];
        int last=arr[arr.length-1];

        if(first==last) return "yes";

        if(first==1 && second==last) return "yes";

        if(first==second && second==secondLast && secondLast==(last-1)) return "yes";

        return "NO";
    }
}
