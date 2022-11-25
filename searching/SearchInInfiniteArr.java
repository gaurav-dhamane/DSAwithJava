package searching;

public class SearchInInfiniteArr {
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5,6,8,9,10,11,13,15,16,17,18,19,21,29,31,32,35,36,40};
        int target=3;

        int ans= ans(arr, target);
        
        System.out.println("found at: "+ans);
        
        
    }
    static int ans(int[] arr, int target){
        int start= 0;
        int end=1;
        while(arr[end]<target){
            int temp = end+1;
            end=end+(end-start+1)*2;
            start=temp;
        }

        return search(arr, target, start, end);
    }
 
    static int search(int[] arr, int target,int start,int end){

        int mid;

        while(start<=end){
            mid= start+(end-start)/2;
            if (arr[mid]<target){
                start=mid+1;
            }
            else if(arr[mid]>target){

                end=mid-1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
