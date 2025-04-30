package LeedCodeProblem.Array;

public class majorityElementBayerALgo {
    public static void main(String[] args) {
        int[] arr={1,2,3,2,4};
        int ans=majElemnet(arr);
        System.out.println(ans);
    }
    static int majElemnet(int[] arr){
        int maj=arr[0];
        int count=1;
        for(int i:arr){
            if(maj==i){
                count++;

            }
            else{
                count--;
            }
            if(count==0){
                maj=i;
                count=1;
            }
        }
        return maj;
    }
}
