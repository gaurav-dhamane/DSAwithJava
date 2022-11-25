package leetcodesolved;
//leetcode: https://leetcode.com/problems/running-sum-of-1d-array/description/

import java.util.Arrays;

public class RunningSum {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6,7};

        int[] ans=runningSum(nums);
        System.out.println(Arrays.toString(ans));
    }


    public static int[] runningSum(int[] nums) {
        int[] arr= new int[nums.length];
        int sum= 0;
        for(int i=0;i<nums.length;i++){
            sum= sum+nums[i];
            arr[i]= sum;
        }
        return arr;
    }
}
