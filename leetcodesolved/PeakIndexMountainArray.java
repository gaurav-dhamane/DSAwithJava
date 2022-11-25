package leetcodesolved;
//leetcode: https://leetcode.com/problems/peak-index-in-a-mountain-array/

public class PeakIndexMountainArray {

    public static void main(String[] args) {
        int[] arr={0,10,5,2};
        System.out.println(peakIndexInMountainArray(arr));
    }

    public static int peakIndexInMountainArray(int[] arr) {

        int s= 0;
        int e= arr.length-1;
        int mid;



        while(s<e){
            mid= s+(e-s)/2;
            if (arr[mid]<arr[mid+1]){
                // asc
                s= mid+1;
            }
            else{
                // dec
                e=mid;
            }

        }
        return s;

    }
}
