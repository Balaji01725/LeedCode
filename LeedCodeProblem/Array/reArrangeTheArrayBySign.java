package LeedCodeProblem.Array;

public class reArrangeTheArrayBySign {
    public static void main(String[] args) {
        int[] arr={2,4,-2,-5,2,-4};
        int[] ans = reArrangeArrayBySignOrder(arr);
        for(int i:ans){
            System.out.print(i + " ");
        }
    }
    static int[] reArrangeArrayBySignOrder(int[] arr){
        int n=arr.length;
        int[] reArr=new int[n];
        int pos=0,neg=1;
        for(int i=0;i<n;i++){
            if(arr[i]>0){
                reArr[pos]=arr[i];
                pos = pos + 2;
            }
            else{
                reArr[neg]=arr[i];
                neg = neg + 2;
            }
        }
       return reArr;
    }
}
