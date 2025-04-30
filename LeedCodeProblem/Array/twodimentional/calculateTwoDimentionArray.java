package LeedCodeProblem.Array.twodimentional;

import java.util.Scanner;

public class calculateTwoDimentionArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row size");
        int rowSize = sc.nextInt();
        System.out.println("Enter the column size");
        int columnSize = sc.nextInt();
        int[][] arr = new int[rowSize][columnSize];
        for (int i = 0; i < rowSize; i++) {
            for (int j = 0; j < columnSize; j++) {
                arr[i][j] = sc.nextInt();


            }

        }
        int ans1 = calculateFirstDiagonal(arr);
//        calculateSecondDiagonal();
        System.out.println(ans1);

    }
    static int calculateFirstDiagonal(int[][] arr) {
        int rowSize = arr.length;
        int colSize = arr[0].length;
        int firstSum = 0;
        for (int i=0;i<rowSize;i++) {
            for (int j=0;j<colSize;j++) {
                if (i == j) {
                    firstSum += arr[i][j];
                }
            }
        }
        return firstSum;
    }
}


