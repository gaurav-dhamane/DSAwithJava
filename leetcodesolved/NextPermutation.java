package leetcodesolved;

//leetcode: https://leetcode.com/problems/next-permutation/

import java.util.Arrays;

public class NextPermutation {
    public static void main(String[] args) {

        int [] arr={7,9,8};
        nextPermutation(arr);

    }


    public static void nextPermutation(int[] nums) {
        if( nums==null || nums.length<=1) return;
        int i= nums.length-2;
        while(i>=0 && nums[i]>=nums[i+1])i--;
        if(i>=0){
            int j=nums.length-1;
            while(nums[j]<=nums[i])j--;

            swap(nums,i,j);
        }
        reverse(nums, i+1,nums.length-1);
        System.out.println(Arrays.toString(nums));
    }


    static void swap(int[] nums,int ind1,int ind2){

        int temp=nums[ind1];
        nums[ind1]=nums[ind2];
        nums[ind2]=temp;
    }

    static void reverse(int[] nums,int i, int j){
        while(i<j)swap(nums,i++,j--);

    }
}

