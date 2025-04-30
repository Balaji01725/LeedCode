package LeedCodeProblem.Array;

import java.util.Scanner;

public class duplicateInAnArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();
        System.out.println("Array of the element:");
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        duplicateArray(arr);
        for(int i:arr){
            System.out.println("Remove Duplicate elements:"+i);
        }

    }
    static void duplicateArray(int[] arr){
        int i=0;
        for(int j=1;j<arr.length;j++){
            if(arr[j]!=arr[i]){
                arr[i+1]=arr[j];
                i++;
            }
        }


    }

}
