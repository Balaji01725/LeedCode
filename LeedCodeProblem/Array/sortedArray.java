package LeedCodeProblem.Array;

import java.util.Scanner;

public class sortedArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size=sc.nextInt();
        System.out.println("Array of the element:");
        int[] arr=new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        sortingArray(arr);
        for(int i:arr){
            System.out.println(i);
        }
    }
    static void sortingArray(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {

            } else {

            }
        }

    }}

