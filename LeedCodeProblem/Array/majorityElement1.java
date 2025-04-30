package LeedCodeProblem.Array;

public class majorityElement1 {
    public static void main(String[] args) {
        int[] arr={1,2,2,3,4,3,3,3,6};
        int ans=majority(arr);
        System.out.println(ans);
    }
    static int majority(int[] arr){
        int maxValue=0;
        int maj=0;
        for(int i=0;i<arr.length;i++){
            int count=1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count+=1;
                }
                if(count>maxValue){
                    maxValue=count;
                    maj=arr[i];
                }
            }

        }
        return maj;
    }
}
