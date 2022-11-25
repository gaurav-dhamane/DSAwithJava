package leetcodesolved;
//leetcode :https://leetcode.com/problems/split-array-largest-sum/
public class SplitArrayLargestSum {
    public static void main(String[] args) {
        int[] arr={2,9,5,6,9,8};
        System.out.println(splitArray(arr,2));

    }

    public static int splitArray(int[] arr, int m) {
        int start= 0;
        int end= 0;

        for (int i = 0; i < arr.length; i++) {
            start= Math.max(start, arr[i]);
            end += arr[i];
        }

        while(start<end){
            int mid= start+ (end-start)/2;
            int sum= 0;
            int pieces= 1;
            for (int i : arr) {
                if(sum+i>mid){
                    sum=i;
                    pieces++;
                }
                else{
                    sum+=i;
                }
            }
            if(pieces>m){
                start=mid+1;
            }
            else{
                end= mid;
            }

        }

        return end;
    }

}
