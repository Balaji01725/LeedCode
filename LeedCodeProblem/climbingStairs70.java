package LeedCodeProblem;

import java.util.Scanner;

public class climbingStairs70 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value:");
        int n=sc.nextInt();
        int ans=climbing(n);
        System.out.println("How many steps we have:"+" "+ n);

    }
    static int climbing(int n){
        if(n==1) return 1;
        if(n==2) return 2;

        int[] dp=new int[n+1];
        dp[1]=1;
        dp[2]=2;
        for(int i=3;i<=n;i++){
            dp[i]=dp[i-2]+dp[i-1];
        }
        return dp[n];
    }
}
