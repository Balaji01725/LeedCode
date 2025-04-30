package LeedCodeProblem.Array;

import java.util.HashSet;
import java.util.Set;
public class longestConsecutiveSeq {
    public static void main(String[] args) {
        int[] arr={1,2,101,103,5,6,7,104,105,10,11,12,13,14,15};
        System.out.println(findTheSeq(arr));
    }
    static int findTheSeq(int[] arr){
        int longestSeq=Integer.MIN_VALUE;
        Set<Integer> set=new HashSet<>();
        for(int i:arr){
            set.add(i);
        }
       for(int i:arr){
           if(!set.contains(i-1)){
               int currentVal=i;
               int currentSeq=1;
               while(set.contains(currentVal+1)){
                   currentVal++;
                   currentSeq++;
               }
               longestSeq=Math.max(currentSeq,longestSeq);
           }

       }
      return longestSeq;
    }
}
