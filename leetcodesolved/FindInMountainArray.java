


// leetcode: https://leetcode.com/problems/find-in-mountain-array/


package leetcodesolved;

import java.util.Scanner;

public class FindInMountainArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr = { 2, 3, 5, 9, 19, 15, 6, 1 };
        //            0  1  2  3   4   5  6  7
    
        int target = in.nextInt();
        in.close();
        int a = search(arr, target);
        System.out.println("found at: "+a);
        
    }

    static int search(int[] arr, int target) {
        int peakIndex = peak(arr);

        // int ans = -1;
        int ans = binarySearch(arr, target, 0, peakIndex);

        if (ans != -1) {
            return ans;
        } 
        return binarySearch(arr, target, peakIndex , arr.length - 1);
        

    }

    // this method applys BS:
    static int binarySearch(int[] arr, int elem, int lo, int hi) {
     
        boolean isAsc = arr[lo] < arr[hi];
        int mid;
        while (lo <= hi) {
            mid = lo + (hi - lo) / 2;
            if (elem == arr[mid]) {
                return mid;
            }
            if (isAsc) {
                if (elem < arr[mid]) {
                    hi = mid - 1;
                } else {
                    lo = mid + 1;
                }
            } else {
                if (elem > arr[mid]) {
                    hi = mid - 1;
                } else {
                    lo = mid + 1;
                }
            }
        }
        return -1;
    }

    // this method returns peak el
    static int peak(int[] arr) {

        int s = 0;
        int e = arr.length - 1;
        int mid;

        while (s < e) {
            mid = s + (e - s) / 2;
            if (arr[mid] < arr[mid + 1]) {
                // asc
                s = mid + 1;
            } else {
                // dec
                e = mid;
            }

        }
        return s;
    }

}
