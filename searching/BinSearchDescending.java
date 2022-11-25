package searching;

import java.util.Scanner;

public class BinSearchDescending {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int [] arr= {18,16,15,15,12,11,9,5,3,1,0,-5};

            while (true){
                int el= in.nextInt();
                int ans=find(arr, el);
                if(ans>-1) {
                    System.out.println("element found at index: " +ans);
                }
                else{
                    System.out.println("element not present in array");
                }
            }
        }


    }

    static int find(int[] arr, int el){
        int lo= 0;
        int hi= arr.length-1;
        int mid;
        while (lo<=hi){
            mid = lo +(hi-lo)/2;
            if (el<arr[mid]){
                lo= mid+1;
            }
            else if(el>arr[mid]){
                hi= mid-1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
