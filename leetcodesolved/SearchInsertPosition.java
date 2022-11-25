package leetcodesolved;
//leetcode: https://leetcode.com/problems/search-insert-position/

public class SearchInsertPosition {

    public static void main(String[] args) {
        int[] arr= {1,3,5,6};
        int target=2;

        System.out.println(searchInsert(arr,target));
    }



    public static int searchInsert(int[] arr, int target) {
        int hi=arr.length-1;
        int lo=0;
        int mid;


        while(lo<=hi){
            mid=lo+(hi-lo)/2;

            if(arr[mid]<target){
                lo=mid+1;
            }
            else if(arr[mid]>target){
                hi=mid-1;

            }
            else{
                return mid;
            }
        }

        return lo;
    }
}
