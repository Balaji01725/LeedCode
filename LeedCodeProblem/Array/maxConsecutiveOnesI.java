package LeedCodeProblem.Array;

public class maxConsecutiveOnesI {
    public static void main(String[] args) {
        int[] arr={1,1,1,1,0,0,1,1,1,1,1,1,0};
        System.out.println(findTheMax(arr));
    }
    static int findTheMax(int[] arr){
        int count=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==1){
                count++;
            }else{
                count=0;
            }
            max=Math.max(max,count);
        }
        return max;
    }
}
