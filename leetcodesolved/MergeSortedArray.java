package leetcodesolved;
//leetcode: https://leetcode.com/problems/merge-sorted-array/

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1={1,2,3,0,0,0};
        int[] nums2={2,5,6};
        
        int m=0;
        for (int i = 0; i < nums1.length; i++) {
            if(nums1[i]==0){
                break;
            }
            m=i;
        }

        System.out.println("Answer: ");
        merge(nums1,m+1,nums2,nums2.length );
        System.out.println(Arrays.toString(nums1));
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] mix= new int[ nums1.length];
        int i=0,j=0,k=0;

        while (i<m && j<n){
            if(nums1[i]>nums2[j]){
                mix[k]=nums2[j];
                j++;
            }
            else {
                mix[k]=nums1[i];
                i++;
            }
            k++;
        }
        while (i<m){
            mix[k]=nums1[i];
            i++;
            k++;
        }
        while (j<n){
            mix[k]=nums2[j];
            j++;
            k++;
        }

        System.arraycopy(mix,0,nums1,0,nums1.length);

    }
}
