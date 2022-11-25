package searching;
//search in sorted matrix

import java.util.Arrays;
import java.util.Scanner;

public class SortedMatrixSearch {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[][] matrix ={
            {1,2,3,4,5,6,7,8},
            {9,10,12,14},
            {18,55,99}
        };
        // System.out.println(findRow(matrix, 10));
        while (true){
            int target = sc.nextInt();
            int[] ans= binarySearch(matrix, target);

            System.out.println(Arrays.toString(ans));
            
        }
    }

    static int findRow(int[][] matrix, int target){
     int start=0;
     int end= matrix.length-1;

     int mid;

     while (start <= end){
        mid= start+(end-start)/2;
        int col= matrix[mid].length-1;
        if(matrix[mid][0]<=target && matrix[mid][col]>=target){
            return mid;
        }
        else if(matrix[mid][0]>target){
            end= mid-1;
        }
        else{
            start= mid+1;
        }
     }
        return -1;
    }

    static int[] binarySearch(int[][] matrix, int target){
        
        int row=findRow(matrix, target);
        if(row>=0){

            int start= 0; 
            int end= matrix[row].length-1;
            
            int mid;
            
            while(start<=end){
            mid= start+(end-start)/2;
            
            if(target==matrix[row][mid]){
                return new int[] {row,mid};
            }
            else if(target<matrix[row][mid]){
                end=mid-1;
            }
            else{
                start= mid+1;
            }
            
        }
    }

        return new int[] {-1,-1}; 
    }
}
