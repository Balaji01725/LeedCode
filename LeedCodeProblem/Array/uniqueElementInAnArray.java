package LeedCodeProblem.Array;

import java.util.HashMap;
import java.util.Map;

public class uniqueElementInAnArray {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,2,1};
        System.out.println(findTheUniqueElement(arr));
    }
    static int findTheUniqueElement(int[] arr){
        int index=-1;

        Map<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<arr.length;i++){
            int val=arr[i];

            int freq=map.getOrDefault(val,0);
            map.put(val,(freq+1));
        }
        for (int i=0;i<arr.length;i++){
            if(map.get(arr[i])==1){
                index=i;
                break;
            }
        }
        return index;
    }
}
