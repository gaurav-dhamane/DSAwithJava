package leetcodesolved;
//https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
import java.util.Arrays;

public class PositionOfElement {

    public static void main(String[] args) {
        int[] arr= {5,7,7,8,8,10};
        int[] ans= searchRange(arr, 7);
        System.out.println(Arrays.toString(ans));
    }


    public static int[] searchRange(int[] nums, int target) {
        int[] ans= {-1,-1};

        ans[0]= search(nums,target,true);
        if(ans[0] !=-1){
            ans[1]= search(nums, target, false);
        }



        return ans;


    }

    public static int search(int[] nums, int target , boolean isStart){
        int s= 0;
        int e= nums.length-1;

        int mid;

        int ans=-1;

        while(s<=e){
            mid= s+(e-s)/2;

            if (nums[mid]<target){
                s=mid+1;
            }
            else if (nums[mid]>target){
                e= mid-1;
            }
            else{
                ans= mid;

                if(isStart){
                    e=mid-1;
                }
                else{
                    s=mid+1;
                }
            }
        }
        return ans;
    }


}
