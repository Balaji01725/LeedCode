package LeedCodeProblem.Array.twodimentional;

import java.util.Scanner;

public class findTheTwoDimentionArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row size:");
        int rowSize = sc.nextInt();
        System.out.println("Enter the column size:");
        int columnSize = sc.nextInt();
        int[][] arr = new int[rowSize][columnSize];
        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < columnSize; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < columnSize; j++) {
                System.out.println(arr[i][j]);
            }


            System.out.println("\n");

        }
        System.out.println( );
    }
}