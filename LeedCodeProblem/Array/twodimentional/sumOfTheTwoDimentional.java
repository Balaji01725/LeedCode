package LeedCodeProblem.Array.twodimentional;

import java.util.Scanner;

public class sumOfTheTwoDimentional {
    public static void main(String[] args) {
        int sum1=0;
        int sum2=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the row values");
        int rowSize=sc.nextInt();
        System.out.println("Enter the column values");
        int columnSize=sc.nextInt();
        int[][] arr=new int[rowSize][columnSize];
        for(int i=0;i<rowSize;i++){
            for(int j=0;j<columnSize;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<rowSize;i++){
            for(int j=0;j<columnSize;j++){
                if(i==j){
                    sum1=sum1+arr[i][j];

                }
                if(i+j==arr.length-1){
                    sum2=sum2+arr[i][j];


                }
            }

        }
        System.out.println("sum of first diagonal");
        System.out.println(sum1);
        System.out.println("sum of second diagonal");
        System.out.println(sum1);
    }
}
