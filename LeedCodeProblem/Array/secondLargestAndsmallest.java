package LeedCodeProblem.Array;

import java.util.Scanner;

public class secondLargestAndsmallest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size:");
        int size=sc.nextInt();
        System.out.println("Enter the array elaments:");
        int[] arr=new int[size];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        int answer=secondLargest(arr);
        System.out.println("Second largest values is:"+answer);
        int answer1=secondSmallest(arr);
        System.out.println("Second smallest value is:"+answer1);
    }
    static int secondLargest(int[] arr){
        int largest=arr[0];
        int slargest=-1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>largest){
                slargest=largest;
                largest=arr[i];
            } else if (arr[i]!=largest && arr[i]>slargest) {
                slargest=arr[i];
            }
        }
        return slargest;
    }
    static int secondSmallest(int[] arr){
        int smallest=arr[0];
        int ssmallest=-1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]<smallest){
                ssmallest=smallest;
                smallest=arr[i];
            } else if (arr[i]!=smallest && arr[i]<ssmallest) {
                ssmallest=arr[i];
            }
        }
        return ssmallest;
    }
}
