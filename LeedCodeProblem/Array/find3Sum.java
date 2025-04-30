package LeedCodeProblem.Array;
import java.util.*;
public class find3Sum {
    public static void main(String[] args) {
        int[] arr={-1,1,2,0,-2,-1};
        System.out.println(findSum(arr));
    }
    static List<List<Integer>> findSum(int[] arr){
        Arrays.sort(arr);
        int n=arr.length;
        Set<List<Integer>> lists=new HashSet<>();
        for(int i=0;i<n-2;i++){
            int l=i+1;
            int r=n-1;

            while(l<r){
                int sum=arr[i]+arr[l]+arr[r];

                if(sum==0){
                    lists.add(Arrays.asList(arr[i],arr[l],arr[r]));
                    l++;
                    r--;
                }
                else if(sum<0){
                    l++;
                }
                else{
                    r--;
                }
            }
        }
        return new ArrayList<>(lists);
    }
}
