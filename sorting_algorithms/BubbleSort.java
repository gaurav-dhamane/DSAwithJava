package sorting_algorithms;
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr= {-5,8,9,1,0,0,0,-5,-6,-98,0,98};
        sortArr(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void sortArr(int[] arr){
        
        for (int i = 0; i < arr.length; i++) {

            for (int j = 1;j < arr.length-i; j++) {

                if(arr[j-1]>arr[j]){
                    int temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                    
                }

            }
            
        }
    }
}
