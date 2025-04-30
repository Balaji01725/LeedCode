package LeedCodeProblem.Array;

public class bestTimeToBuyAndSellStoke {
    public static void main(String[] args) {
        int[] arr={7,1,5,3,6,4};
        System.out.println(findMaxProfitForTheStoke(arr));
    }
    static int findMaxProfitForTheStoke(int[] arr){
        int currentPrize=arr[0];
        int maxProfit=0;
        for(int i=1;i<arr.length;i++){
            currentPrize=Math.min(arr[i],currentPrize);
            int currentProfit=arr[i]-currentPrize;
            maxProfit=Math.max(maxProfit,currentProfit);
        }
        return maxProfit;
    }
}
