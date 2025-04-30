package LeedCodeProblem.Array;

public class twoSum2 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int l=0;
        int r=arr.length-1;
        int target=7;
        for (int i : find2Sum(arr,l,r,target)) {
            System.out.print(i + " ");
        }
    }
    static int[] find2Sum(int[] arr,int l,int r,int target){
        while(l<r){
            int sum=arr[l]+arr[r];
            if(sum==target){
                return new int[] {l+1,r+1};
            }
            else if(sum<target){
                l++;
            }
            else{
                r--;
            }
        }
        return new int[] {};
    }
}
