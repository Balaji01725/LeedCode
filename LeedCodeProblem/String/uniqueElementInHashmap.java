package LeedCodeProblem.String;

import java.util.HashMap;
import java.util.Map;

public class uniqueElementInHashmap {
    public static void main(String[] args) {
        String str="balabi";
        System.out.println(findTheUnique(str));
    }
    static int findTheUnique(String str){
        int index=-1;
        Map<Character,Integer> map=new HashMap<>();

        for(int i=0;i<str.length()-1;i++){
        char c=str.charAt(i);
        int freq=map.getOrDefault(c,0);
        map.put(c,(freq+1));
        }
        for(int i=0;i<str.length()-1;i++){
            if(map.get(str.charAt(i))==1){
                index=i;
                break;
            }

        }
        return index;
    }
}
