package LeedCodeProblem.Array;

public class rotateImage {
    public static void main(String[] args) {
        int[][] arr={{1,2,3},{4,5,6},{7,8,9}};
        toRotate(arr);

    }
    static void toRotate(int[][] arr){
        transportMatrix(arr);
        reverseMatrix(arr);
    }
    static void transportMatrix(int[][] arr){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;i<arr.length;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }
    }
    static void reverseMatrix(int[][] arr){
        for(int i=0;i<arr.length-1;i++){
            int left=0,right=arr.length-1;
            while(left<right){
                int temp=arr[i][left];
                arr[i][left]=arr[i][right];
                arr[i][right]=temp;
                left++;
                right--;
            }
        }

    }
}
