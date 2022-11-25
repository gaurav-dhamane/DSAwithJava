package sorting_algorithms;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr= {10,9,8,7,6,5,4,3,2,1,0};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void selectionSort(int[] arr){

        for (int i = 0; i <= arr.length-1; i++) {
            int end= arr.length-i-1;
            int max= getMaxIndex(arr, end);
            swap(arr, max,end);


        }
    }

    static int getMaxIndex(int[] arr, int end){
        int max= 0;
        for (int i = 0; i <= end; i++) {
            if(arr[i]>arr[max]){
                max= i;
            }
        }
        return max;
    }

    static void swap(int[] arr, int first,int second){
        int temp= arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
