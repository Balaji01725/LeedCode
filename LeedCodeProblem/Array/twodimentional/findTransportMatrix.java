package LeedCodeProblem.Array.twodimentional;

import java.util.Scanner;

public class findTransportMatrix {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the rowsize:");
        int rowSize=sc.nextInt();
        System.out.println("Enter the columnsize");
        int columnSize=sc.nextInt();
        int[][] arr=new int[rowSize][columnSize];
        for(int i=0;i<rowSize;i++){
            for(int j=0;j<columnSize;j++)
                arr[i][j]=sc.nextInt();
        }


        System.out.println("Enter the transport matrix:"+transferTheMatrix(arr));
    }
    static int[][] transferTheMatrix(int[][] arr){
        int rowSize=arr.length;
        int columnSize= arr.length;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
        return arr;
    }

}
