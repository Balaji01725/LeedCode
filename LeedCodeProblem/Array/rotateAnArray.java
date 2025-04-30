package LeedCodeProblem.Array;

import java.util.Scanner;

public class rotateAnArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("how many roatation you have:");
        int d=sc.nextInt();
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();
        System.out.println("Array of the element:");
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        rotate(arr,d);
        for(int i=0;i<arr.length;i++)
            System.out.println(arr[i]);
    }
    static void rotate(int[] arr,int d){
        d=d%arr.length;
        reverse(arr,0,d-1);
        reverse(arr,d+1,arr.length-1);
        reverse(arr,0,arr.length-1);


    }
    static void reverse(int[] arr,int l,int r){
        while(l<r){
            swap( arr,l,r);
            l++;
            r--;
        }
    }
    static void swap(int[] arr,int l,int r){
        int temp=arr[l];
        arr[l]=arr[r];
        arr[r]=temp;
    }
}
