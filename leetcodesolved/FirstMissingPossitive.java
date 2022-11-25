package leetcodesolved;
//leetcode: https://leetcode.com/problems/first-missing-positive/

public class FirstMissingPossitive {

    public static void main(String[] args) {
        int[] nums= {1,4,3,74,-1,2};
        int ans =firstMissingPositive(nums);
        System.out.println(ans);
    }
    public static int firstMissingPositive(int[] nums) {


        int mp=1;
        sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]==mp){
                mp++;
            }
        }
        return mp;
    }
    static void sort(int[] arr){
        int i=0;
        while(i<arr.length){
            if(arr[i]<arr.length && arr[i]>0 ){

                int correct= arr[i]-1;
                if(arr[i] != arr[correct]){
                    swap(arr, i, correct);
                }
                else{
                    i++;
                }
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
