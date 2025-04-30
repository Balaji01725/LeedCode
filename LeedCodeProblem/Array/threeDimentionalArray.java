package LeedCodeProblem.Array;

import java.util.Scanner;

public class threeDimentionalArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][][] arr = new int[3][4][4];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr[i][j].length; k++) {
                    arr[i][j][k] = i+j+k;
                }
            }
        }
        for(int i[][] :arr){
            for(int j[]:i){
                for(int k:j){
                    System.out.println(k+" ");
                }
                System.out.println( );
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr[i][j].length; k++) {
                    System.out.println(arr[i][j][k]);
                }
                System.out.println();
            }
        }
    }
}