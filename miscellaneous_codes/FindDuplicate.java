package miscellaneous_codes;

import java.util.ArrayList;

public class FindDuplicate {
    public static void main(String[] args) {
        int[] arr={5,4,1,2,3,2,1,5};
        sort(arr);
        ArrayList<Integer> ans= dupArr(arr);
        
    
        System.out.println(ans);
    }

    static ArrayList<Integer> dupArr(int[] arr){
        int i=0;
        ArrayList <Integer> ans= new ArrayList<>();
        while(i<arr.length){

            if(arr[i] != i+1){
                ans.add(arr[i]);
                i++;
            }
            else{
                i++;
            }

        }
        
        return ans;
    }


    static void sort(int[] arr){
        int i=0;
        while(i<arr.length){
            int correct= arr[i]-1;
            if(arr[i] != arr[correct]){
                swap(arr, i, correct);
            }
            else{
                i++;
            }

        }


    }
    static void swap(int[] arr, int first,int second){
        int temp= arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
