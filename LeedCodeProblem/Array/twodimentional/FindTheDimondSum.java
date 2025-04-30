package LeedCodeProblem.Array.twodimentional;

import java.util.Scanner;

public class FindTheDimondSum {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the rowsize:");
        int rowSize=sc.nextInt();
        System.out.println("Enter the columnsize");
        int columnSize=sc.nextInt();
        int[][] arr=new int[rowSize][columnSize];
        for(int i=0;i<rowSize;i++){
            for(int j=0;j<columnSize;j++){
                arr[i][j]=sc.nextInt();
            }
        }
         int ans=calculateTheDimondValues(arr);
        System.out.println("Enter the sum of dimond values"+ans);
    }
    static int calculateTheDimondValues(int[][] arr){
        int rowSize=arr.length;
        int columnSize=arr[0].length;
        int sum=0;
        for(int i=0;i<rowSize;i++){
            for(int j=0;j<columnSize;j++){
                if(i!=j &&i+j!=arr.length-1){
                    sum=sum+arr[i][j];
                }
            }
        }
        return sum;
    }
}
