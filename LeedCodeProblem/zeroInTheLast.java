package LeedCodeProblem;

import java.util.Scanner;

public class zeroInTheLast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int size = sc.nextInt();
        System.out.println("Enter the array values");
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
       arrangeTheZero(arr);
        for(int i:arr){
            System.out.println("zeroth in last index: "+i);
        }
    }

    static void arrangeTheZero(int[] arr) {
    int nzero=0;
    for(int i=0;i<arr.length-1;i++){
        if(arr[i]!=0){
            int temp=arr[i];
            arr[i]=arr[nzero];
            arr[nzero]=temp;
            nzero++;
        }
    }
    }
}

