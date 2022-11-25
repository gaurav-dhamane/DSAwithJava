package leetcodesolved;
//leetcode: https://leetcode.com/problems/set-mismatch/

import java.util.Arrays;

public class SetMismatch {
    public static void main(String[] args) {
        int[] arr= {1,2,2,4,6,5};

        int[] ans= findErrorNums(arr);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] findErrorNums(int[] arr) {

        int i=0;
        sort(arr);

        while(i<arr.length){


            if(arr[i]!=i+1){
                return new int[] {arr[i],i+1};
            }
            else{
                i++;
            }
        }

        return new int[]{-1,-1};
    }

    static void sort(int[] arr){
        int i=0;
        while(i<arr.length){
            int correct= arr[i]-1;
            if(arr[i] != arr[correct]){
                swap(arr, i, correct);
            }
            else{
                i++;
            }

        }


    }
    static void swap(int[] arr, int first,int second){
        int temp= arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
