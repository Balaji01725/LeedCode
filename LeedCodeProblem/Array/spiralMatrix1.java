package LeedCodeProblem.Array;

import java.util.ArrayList;
import java.util.List;

public class spiralMatrix1 {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}};
        System.out.println(countTheSpirals(arr));

    }

    static List<Integer> countTheSpirals(int[][] arr) {
            int left = 0, right = arr[0].length - 1;
        int top = 0, bottom = arr.length - 1;

        List<Integer> all = new ArrayList<>();

        while (left <= right && top <= bottom) {

            for (int i = left; i <= right; i++) {
                all.add(arr[top][i]);
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                all.add(arr[i][right]);
            }
            right--;

            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    all.add(arr[bottom][i]);
                }
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    all.add(arr[i][left]);
                }
                left++;
            }


        }
        return all;
    }
}

