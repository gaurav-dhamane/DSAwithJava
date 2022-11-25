package leetcodesolved;
import java.util.Arrays;
//leetcode: https://leetcode.com/problems/shuffle-the-array/

public class ShuffleArray {

    public static void main(String[] args) {
        int[] arr={2,5,1,3,4,7};
        int n=3;
        int[] ans= shuffle(arr,n);
        System.out.println(Arrays.toString(ans));
    }


    public static int[] shuffle(int[] nums, int n) {
        int[] arr= new int[nums.length];
        int count= 0;
        for(int i= 0; i<nums.length;i++){
            if(i%2==0){
                arr[i]=nums[count];
                count++;
            }
            else{
                arr[i]=nums[n];
                n++;
            }
        }
        return arr;
    }
}
