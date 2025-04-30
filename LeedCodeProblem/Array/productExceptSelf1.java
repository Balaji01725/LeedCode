package LeedCodeProblem.Array;

public class productExceptSelf1 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        int[] pro=exceptSelf(arr);
        for(int i:pro){
            System.out.println(i);
        }
    }
    static int[] exceptSelf(int[] arr){
        int n=arr.length;
        int pre=1;
        int pos=1;
        int[] ans=new int[n];
        for(int i=0;i<n;i++){
            ans[i]=1;
        }
        for(int i=0;i<n;i++){
            ans[i]=ans[i]*pre;
            pre=pre*arr[i];
        }
        for(int i=n-1;i>=0;i--){
            ans[i]=ans[i]*pos;
            pos=pos*arr[i];
        }
        return ans;
    }
}
