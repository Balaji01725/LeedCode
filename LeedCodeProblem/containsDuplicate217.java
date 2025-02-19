package LeedCodeProblem;

import java.util.*;

public class containsDuplicate217 {
    public static void main(String[] args) {
        System.out.println(containsDuplicate(new int[] {1,2,3,4,5}));
    }
    static boolean containsDuplicate(int[] arr){
        Set<Integer> set= new HashSet<>();
        for(int i:arr){
            if(!set.add(i)){
                return true;
            }
        }
        return false;
    }
}
