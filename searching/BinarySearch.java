package searching;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
             int[] arr= {4,5,6,7,8};
             //          0 1 2 3 4 5 6  7  8  9
             while(true){
                
                 int el=in.nextInt() ;
                  int index= find(arr, el);
                 if (index>=0){
                     System.out.println("Element found at index: "+index);
                 }
                 else{
                     System.out.println("Element not found in array");
                 }
             }
        }
        
        
    }

    public static int find(int[] arr, int el){
        int lo= 0;
        int hi= arr.length-1;
        int mid;
        
        while(lo<=hi){
            
            mid= lo+ (hi-lo)/2;
            if (el==arr[mid]){
                return mid; 
            }
            else if(el< arr[mid]){
                hi= mid-1;
            }
            else {
                lo= mid+1;
            }

        }

        return -1;
        
    }
}
