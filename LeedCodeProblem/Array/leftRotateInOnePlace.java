package LeedCodeProblem.Array;

import java.util.Scanner;

public class leftRotateInOnePlace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();
        System.out.println("Array of the element:");
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        leftRoatate(arr);
        for(int i:arr){
            System.out.println(i);
        }
    }
    static int leftRoatate(int[] arr){
        int n=arr.length;
        int temp=arr[0];
        for(int i=1;i<n;i++){
            arr[i-1]=arr[i];
        }
        arr[n-1]=temp;
        return arr[n-1];
    }
}