package LeedCodeProblem.Array;

import java.util.Scanner;

public class seperateOddEvenArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array values");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the even numbers:");
        for (int i = 0; i < size; i++) {
            if (arr[i] % 2 == 0) {
                System.out.println(arr[i]);
            }

        }
        System.out.println("Enter the odd numbers:");
        for(int i=0;i<size;i++){
            if(arr[i]%2==1){
                System.out.println(arr[i]);
            }
        }


    }
}