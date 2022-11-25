package leetcodesolved;
//leetcode: https://leetcode.com/problems/find-numbers-with-even-number-of-digits/


public class EvenDigitNumCount {

    public static void main(String[] args) {
        int[] arr={12,345,2,6,7896};

        System.out.println(findNumbers(arr));
    }


    public static int findNumbers(int[] nums) {
        int count=0;

        for(int i=0;i<nums.length;i++){
            String temp= Integer.toString(nums[i])         ;

            if(temp.length()%2==0){
                count++;
            }
        }
        return count;
    }
}
