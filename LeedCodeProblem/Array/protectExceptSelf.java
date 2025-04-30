package LeedCodeProblem.Array;

public class protectExceptSelf {
    public static void main(String[] args) {
        int[] arr={1,2,3,6};
        int[] pro=protectExcepting(arr);
        for(int i:pro){
            System.out.println("Multiply itself"+i);
        }
    }
    static int[] protectExcepting(int[] arr){
        int[] ans=new int[4];
        int pre=1;
        int pos=1;
        for(int i=0;i<arr.length;i++){
            ans[i]=1;
        }
        for(int i=0;i<arr.length;i++){
            ans[i]=ans[i]*pre;
            pre=pre*arr[i];
        }
        for(int i=arr.length-1;i>=0;i--){
            ans[i]=ans[i]*pos;
            pos=pos*arr[i];
        }
        return ans;
    }
}
