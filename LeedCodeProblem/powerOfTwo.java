package LeedCodeProblem;

import java.util.Scanner;

public class powerOfTwo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        System.out.println(findThePowerOfTwo(n));
    }
    static boolean findThePowerOfTwo(int n){
        if(n==0){
            return false;
        }
        while(n!=1){
            if(n%2!=0){
                return false;
            }
            else{
                n/=2;
            }
        }
        return true;
    }
}
