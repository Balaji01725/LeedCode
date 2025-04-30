package LeedCodeProblem.Array;

public class maxConsecutiveOnes3 {
    public static void main(String[] args) {
        int[] arr={1,1,0,0,1,1,0,1,1,1,1,0};
        int k=2;
        System.out.println(findTheMax(arr,k));
    }
    static int findTheMax(int[] arr,int k){
        int l=0,r=0;
        int count=0;
        int max=Integer.MIN_VALUE;
        while(r<arr.length){
            if(arr[r]==0) count++;

            while(count>k){
                if(arr[l]==0) count--;
                l++;
            }
            max=Math.max(max,r-l+1);
            r++;
        }
        return max;
    }
}
