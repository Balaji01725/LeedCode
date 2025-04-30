package LeedCodeProblem.Array;

public class rotateArrInKthPlace {
    public static void main(String[] args) {
     int[] arr={1,2,3,4,5,6};
     int k=3;
     rotate(arr,k);
     for(int i:arr){
         System.out.print(i+" ");
     }
    }
    static void rotate(int[] arr,int k){
        int n=arr.length;
        k=k%n;
        rev(arr,0,k-1);
        rev(arr,k,n-1);
        rev(arr,0,n-1);
    }
    static void rev(int[] arr,int l,int r){
        while(l<r){
            swap(arr,l,r);
            l++;
            r--;
        }
    }
    static void swap(int[] arr,int l,int r){
        int temp=arr[l];
        arr[l]=arr[r];
        arr[r]=temp;
    }
}
