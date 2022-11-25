package leetcodesolved;


import java.util.Arrays;

//leetcode: https://leetcode.com/problems/rotate-image/
public class RotateImage {
    public static void main(String[] args) {
        int[][] mat= {{1,2,3},
                {4,5,6},
                {7,8,9}};
        System.out.println("original matrix: ");
        for (int[] arr :
                mat) {
            System.out.println(Arrays.toString(arr));
        }

        System.out.println("Answer: ");
        rotate(mat);
        for (int[] arr :
                mat) {
            System.out.println(Arrays.toString(arr));
        }
    }


    public static void rotate(int[][] matrix) {
        trans(matrix);
        rev(matrix);
    }

    static void rev(int[][] matrix){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix.length/2;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[i][matrix.length-j-1];
                matrix[i][matrix.length-j-1]=temp;
            }
        }
    }



    static void trans(int[][] matrix){

        for(int i=0;i<matrix.length;i++){
            for(int j=i;j<matrix.length;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
    }
}
