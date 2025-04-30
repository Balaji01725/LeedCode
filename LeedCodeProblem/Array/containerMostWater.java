package LeedCodeProblem.Array;

public class containerMostWater {
    public static void main(String[] args) {
        int[] arr={1,8,6,2,5,4,8,3,7};
        System.out.println(findContainer(arr));
        
    }
    static int findContainer(int[] arr){
        int left=0,right=arr.length-1;
        int maxContainer=Integer.MIN_VALUE;
        while(left<right){
            int containerHeight=Math.min(arr[left],arr[right]);
            int containerWidth=right-left;
            int currentContainer=containerHeight*containerWidth;

            maxContainer=Math.max(maxContainer,currentContainer);

            if(arr[left]<arr[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return maxContainer;
    }
}
