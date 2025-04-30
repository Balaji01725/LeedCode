package LeedCodeProblem.Array;

import java.util.Scanner;

public class reverseTheArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array size: ");
        int size=sc.nextInt();
        System.out.println("Enter the array values:");
        int[] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=size-1;i>=0;i--){
            System.out.println("Reverse the array:"+arr[i]);
        }

    }
}
