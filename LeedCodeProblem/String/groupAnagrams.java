package LeedCodeProblem.String;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class groupAnagrams {
    public static void main(String[] args) {
        String[] strs={"eat","tea","tan","ate","nat","bat"};
        System.out.println(findTheAnagram(strs));
    }
    static List<List<String>> findTheAnagram(String[] strs){
        if(strs==null || strs.length==0){
            return new ArrayList<>();
        }
        Map<String,List<String>> freqStringsMap=new HashMap<>();

        for(String str:strs){
            String freqString=getFreqString(str);

            if(freqStringsMap.containsKey(freqString)){
                freqStringsMap.get(freqString).add(str);
            }
            else{
                List<String> strList=new ArrayList<>();
                strList.add(str);
                freqStringsMap.put(freqString,strList);
            }
        }
        return new ArrayList<>(freqStringsMap.values());

    }
    static String getFreqString(String str){
        int[] freq=new int[26];
        for(char c:str.toCharArray()){
            freq[c-'a']++;
        }
        StringBuilder ans=new StringBuilder();
        char c='a';

        for(int i:freq){
            ans.append(c);
            ans.append(i);
            c++;
        }
        return ans.toString();
    }
}
