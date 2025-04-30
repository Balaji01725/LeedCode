package LeedCodeProblem.Array;

public class minimumInSortedAndRotatedArr {
    public static void main(String[] args) {
        int[] arr={4,5,6,2,3};
        System.out.println(findMin(arr));
    }
    static int findMin(int[] arr){
        int low=0;
        int high=arr.length-1;
        while(low<high){
            int mid=(low+high)/2;
            if(arr[mid]>arr[high]){
                low=mid+1;
            }
            else{
                high=mid;
            }
        }
        return arr[low];
    }
}
