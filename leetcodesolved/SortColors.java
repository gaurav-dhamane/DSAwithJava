package leetcodesolved;
//leetcode: https://leetcode.com/problems/sort-colors/description/

import java.util.Arrays;

public class SortColors {

    public static void main(String[] args) {
        int[] arr= {2,0,2,1,1,0};
        System.out.println("Before: ");
        System.out.println(Arrays.toString(arr));
        sortColors(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void sortColors(int[] nums) {


        int low=0,mid=0;
        int high=nums.length-1;

        while(high>=mid){
            if(nums[mid]==0){
                swap(nums,low,mid);
                low++;
                mid++;
            }

            else if(nums[mid]==1){
                mid++;
            }
            else if(nums[mid]==2){
                swap(nums,mid,high);
                high--;
            }
        }


    }

    public static void swap(int[] arr,int a, int b){
        int temp= arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }


}
