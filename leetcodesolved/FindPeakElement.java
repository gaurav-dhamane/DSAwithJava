package leetcodesolved;
//leetcode: https://leetcode.com/problems/find-peak-element/

public class FindPeakElement {
    public static void main(String[] args) {
        int[] arr= {1,2,1,3,5,6,4};

        System.out.println(findPeakElement(arr));
    }

    public static int findPeakElement(int[] arr) {
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
