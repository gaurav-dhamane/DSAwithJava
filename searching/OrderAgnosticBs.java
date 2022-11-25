package searching;

// Detect order of sorted array and apply binary search

import java.util.Scanner;

public class OrderAgnosticBs {
    public static void main(String[] args) {
        try (Scanner in = new Scanner( System.in)) {
            // int[] arr1 = {-12,-6,-4,-1,0,1,2,5,6,7,9,12,14,15,18,20,22,23,25,156,256,259,2566,25999};
            int[] arr2 ={18,16,15,15,12,11,9,5,3,1,0,-5};
            
            
            while (true){
                int elem= in.nextInt();
                System.out.println(findElement(arr2, elem));
                
            }
        }
    }
    static int findElement(int[] arr , int elem){
        int lo = 0;
        int hi= arr.length-1;
        boolean isAsc = arr[lo]<arr[hi];
        int mid;
        while (lo<=hi){
            mid= lo+ (hi-lo)/2;
            if (elem == arr[mid]){
                return mid;
            }
            if (isAsc){
                if(elem< arr[mid]){
                    hi= mid-1;
                }
                else {
                    lo= mid+1;
                }
            }
            else{
                if(elem> arr[mid]){
                    hi= mid-1;
                }
                else {
                    lo= mid+1;
                }
            }
        }
        return -1;

    }
}
