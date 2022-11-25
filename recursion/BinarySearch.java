package recursion;


//Implement binary search using Recursion


public class BinarySearch{
    public static void main(String[] args) {
        
        int[] arr= {1,3,4,5,8,19,36,999,98989};

        int target=1;

        int ans=search(arr, target, 0, arr.length-1);
        System.out.println(ans);

    }

    static int search(int[] arr, int target,int s, int e){

        if(s>e){
            return -1;
        }

        int mid= s+(e-s)/2;

        if(arr[mid]>target){
            
            return search(arr, target, s, mid-1);
        }
        else if(arr[mid]<target){
            
            return search(arr, target, mid+1, e);
        }
        
        return mid;
        
        
    }
}