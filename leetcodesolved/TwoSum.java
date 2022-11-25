package leetcodesolved;

//leetcode: https://leetcode.com/problems/two-sum/

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr={2,74,11,15};
        System.out.println(Arrays.toString(ans(arr, 11+15))  );

    }

    static int[] ans(int[] arr, int target){
        int sIndex;
        for (int i = 0; i < arr.length; i++) {
            int second=target-arr[i];
            sIndex=search(arr, second, i+1);
            if(sIndex>=0){
                return new int[] {i,sIndex};
            }
            
        }
       
      

        return new int[]{-1,-1};
    }

    static int search(int[] arr,int el,int start){
        for (int i = start; i < arr.length; i++) {
            if(arr[i]==el){
                return i;
            }
        }
        return -1;
    }
}
