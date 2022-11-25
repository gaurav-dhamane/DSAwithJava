package searching;

//What is bitonic point in array?
//A Bitonic Point is a point in bitonic sequence before which elements are strictly increasing and after
// which elements are strictly decreasing.

//Example: 1 2 3 4 5 3 0 -8


public class BitonicArray {
        public static void main(String[] args) {
            int[] arr= {7,9,8};
            int ans=peak(arr);
            System.out.println(ans);
        }

        static int search(int[] arr){

            int s= 0; 
            int e= arr.length-1;
            int mid;
            int ans=0;
            
            while(s<=e){
                mid= s+(e-s)/2;
                    if (arr[mid]>arr[mid-1]&& arr[mid]>arr[mid+1]){
                        // System.out.println("1");
                        ans= mid;
                        return ans;
                    }
                    else if(arr[mid]<arr[mid-1]&& arr[mid]>arr[mid+1]){
                        // System.out.println(2);
                        e=mid-1;
                    }
                    else if(arr[mid]>arr[mid-1]&& arr[mid]<arr[mid+1]){
                        // System.out.println(3);
                        s=mid+1;
                    }
                }
            return ans;
            }
            // alternate ans:
            
        static int peak(int[] arr){

            int s= 0; 
            int e= arr.length-1;
            int mid;
            
            

            while(s<e){
                mid= s+(e-s)/2; 
                if (arr[mid]<arr[mid+1]){
                    // asc
                    s= mid+1;
                }
                else{
                    // dec
                    e=mid;
                }
                
            }
            return s;
            }
        }
