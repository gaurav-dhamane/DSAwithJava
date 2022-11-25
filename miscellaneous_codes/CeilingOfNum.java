package miscellaneous_codes;
import java.util.Scanner;

//More precisely, for a number x, floor(x) is the largest integer
// in the array less than or equal to x,
// and ceil(x) is the smallest
// integer in the array greater than or
// equal to x. If the floor or ceil doesn’t exist, consider it to be -1. For example,
// nums[] = [1, 4, 6, 8, 9]
// target= 5

// output :
// ceil=6
//floor=4

public class CeilingOfNum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = { 1, 4,6,8,9}; //
        while(true){
            System.out.print("target: ");
            int target = in.nextInt();
            

//            this is for ceil
            int[] ans =ceil(arr,target);

            System.out.println("Ceil is: "+ans[1]+" and pos in arr: "+ans[0]);
//          this is for floor
            int finalAns= floor(arr, target);
            if(finalAns>=0){

                System.out.println("Floor is: "+arr[finalAns]+" and pos in arr: "+finalAns);
            }
            else if(finalAns==-1){
                in.close();
                System.out.println("End");
            }
            else{
                System.out.println("error");
            }
        }

    }



    static int ceilIndex(int[] arr, int target){
        int hi=arr.length-1;
        int lo=0;
        int mid;
        

        while(lo<=hi){
            mid=lo+(hi-lo)/2;

            if(arr[mid]<target){
                lo=mid+1;
            }
            else if(arr[mid]>target){
                hi=mid-1;

            }
            else{
                return mid;
            }
        }

        return lo;
    }


    

    static int floor(int[] arr, int target){
        int hi=arr.length-1;
        int lo=0;
        int mid;
        

        while(lo<=hi){
            mid=lo+(hi-lo)/2;

            if(arr[mid]<target){
                lo=mid+1;
            }
            else if(arr[mid]>target){
                hi=mid-1;

            }
            else{
                return mid;
            }
        }

        return hi;
    }






//  alternative approach
    static int[] ceil(int[] arr, int target) {
        int lo = 0;
        int hi = arr.length - 1;
        int mid;
        int[] ans = new int[2];
        ans[0] = -1;
        ans[1] = -1;

        // while ()
        while (lo <= hi) {
            mid = lo + (hi - lo) / 2;

            if (arr[mid] < target) {
                lo = mid + 1;
            }

            else if (arr[mid] > target) {
                hi = mid - 1;
                ans[0] = mid;
                ans[1] = arr[mid];
            } else if (arr[mid] == target) {
                ans[0] = mid;
                ans[1] = target;
                return ans;
            }

        }

        return ans;
    }
}
