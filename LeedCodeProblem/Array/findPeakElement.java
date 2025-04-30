package LeedCodeProblem.Array;

public class findPeakElement {
    public static void main(String[] args) {
     int[] arr={1,2,3,4,1,5};
        System.out.println(findPeak(arr));
    }
    static int findPeak(int[] arr){
        int l=0;
        int h=arr.length-1;
        while(l<h){
            int mid=(l+h)/2;
            if(arr[mid]>arr[mid+1]){
                h=mid;
            }else{
                l=mid+1;
            }
        }
        return l;
    }
}
