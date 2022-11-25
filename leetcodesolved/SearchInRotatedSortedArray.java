package leetcodesolved;
//leetcode: https://leetcode.com/problems/search-in-rotated-sorted-array/
public class SearchInRotatedSortedArray {
    
    public static void main(String[] args) {
        int[] arr ={4,5,6,7,8,9,1,2};
        int target = 2;

        System.out.println(search(arr,target));

        
    }

    public static int search(int[] arr, int target) {

        int peak= searchPeak(arr);


        int ans= find(arr,target,0,peak);
        if(ans<0){
            ans= find(arr, target, peak+1, arr.length-1);
        }

        return ans;
    }

    static int searchPeak(int[] arr){
        int start=0;
        int end= arr.length-1;

        int mid=0;

        while(start<=end){
            mid=start+(end-start)/2;

            if(arr[mid]>arr[start]){
                start=mid;
            }
            else if(arr[mid]<arr[start]){
                end=mid;
            }
            else{
                return mid;
            }
        }
        return mid;
    }


    static int find(int[] arr, int el,int lo, int hi){

        int mid;

        while(lo<=hi){

            mid= lo+ (hi-lo)/2;
            if (el>arr[mid]){
                lo=mid+1;

            }
            else if(el< arr[mid]){
                hi= mid-1;
            }
            else {
                return mid;
            }

        }

        return -1;

    }

}
