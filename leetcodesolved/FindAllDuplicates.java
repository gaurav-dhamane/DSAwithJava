package leetcodesolved;
import  java.util.List;
import java.util.ArrayList;
//leetcode: https://leetcode.com/problems/find-all-duplicates-in-an-array/


public class FindAllDuplicates {
    public static void main(String[] args) {
        int[] arr= {4,3,2,7,8,2,3,1,9,9};
        List <Integer> ans= findDuplicates(arr);
        System.out.println(ans);
    }

    public static List<Integer> findDuplicates(int[] arr) {

        int i=0;
        sort(arr);
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
