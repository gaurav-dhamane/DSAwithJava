package miscellaneous_codes;
// if elements in an array are repeating then return the start and end index of repetition.
import java.util.Arrays;

public class RepetitionRange {
  
    public static void main(String[] args) {
        int[] nums={-8,-5,0,1,2,3,7,7,7,7,7,7,7,8,9,9,9,10,10,11,11};
        int target=7;
        int[] ans=new int[2];
        ans =searchRange(nums, target);
        System.out.println(Arrays.toString(ans));
        
    }

    public static int[] searchRange(int[] nums, int target) {
        int[] ans= {-1,-1};
        
        int start= search(nums,target,true);
        int end= search(nums, target, false);
        
        ans[0]=start;
        ans[1]=end;
        return ans;
        
        
    }
    
    public static int search(int[] nums, int target , boolean isStart){
        int s= 0;
        int e= nums.length-1;
        
        int mid;
        
        int ans=-1;
        
        while(s<=e){
            mid= s+(e-s)/2;
            
            if (nums[mid]<target){
                s=mid+1;
            }
            else if (nums[mid]>target){
                e= mid-1;
            }
            else{
                // store the possible answer
                ans= mid;


                
                if(isStart){
                    //  continue loop until we find first occurrence of target
                    e=mid-1;
                }
                else{
                    // continue loop until we find last occurrence of target
                    s=mid+1;
                }
            }
        }
        return ans;
    }
    
    
}




