package searching;

import java.util.Arrays;
import java.util.Scanner;

public class SearchInMatrix {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[][] matrix={
            {10,20,30,40},
            {11,25,35,45},
            {27,28,37,49},
            {33,34,38,50},

        };
        while (true){

            int target= sc.nextInt();
            
            int[] result= search(matrix, target);
            System.out.println(Arrays.toString(result));
            
        }
        
    }

    static int[] search(int[][] matrix, int target){
        int r= 0;
        int c= matrix.length-1;
        
        while(r<matrix.length && c>=0){
            if(matrix[r][c]==target){
                return new int[]{r,c};
            }
            else if(matrix[r][c]<target){
                r++;
            }
            else{
                c--;
            }
        }
        return new int[]{-1,-1};
    }
}
