package LeedCodeProblem.Array;

import java.util.HashMap;
import java.util.Map;

public class majorityElementHasing {
    public static void main(String[] args) {
        int[] arr={1,2,2,3,4,2,2};
        int ans=majorityy(arr);
        System.out.println(ans);
    }
    static int majorityy(int[] arr){
        Map<Integer,Integer> mp=new HashMap<>();
        int maxValue=0;
        int maxCount=0;
        for(int i:arr){
            mp.put(i,(1+ mp.getOrDefault(i,0)));
            if(mp.get(i)>maxValue){
                maxCount=mp.get(i);
                maxValue=i;
            }
        }
        return maxValue;
    }
}
