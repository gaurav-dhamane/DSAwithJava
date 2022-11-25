package leetcodesolved;
//leetcode: https://leetcode.com/problems/missing-number/

public class MissingNumber {

    public static void main(String[] args) {
        int[] arr= {3,0,1};

        System.out.println(missingNumber(arr));

    }

    public static int missingNumber(int[] nums) {
        sort(nums);


        for(int i=0;i<nums.length;i++){
            if(nums[i]!=i){
                return i;
            }
        }
        return nums.length;
    }


    static void sort(int[] arr){
        int i=0;
        while(i<arr.length){
            int correct= arr[i];
            if(arr[i]==arr.length){
                i++;
            }
            else if(arr[i] != arr[correct]){
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
