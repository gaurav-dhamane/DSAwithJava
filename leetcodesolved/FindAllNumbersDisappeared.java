package leetcodesolved;
import java.util.ArrayList;
import java.util.List;

//leetcode: https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/

public class FindAllNumbersDisappeared {

    public static void main(String[] args) {
        int[] arr={4,3,2,7,8,2,3,1};
        List<Integer> ans= findDisappearedNumbers(arr);
        System.out.println(ans);
    }

    public static List<Integer> findDisappearedNumbers(int[] arr) {
        sort(arr);
        ArrayList<Integer> ans=new ArrayList<>(2);
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != i+1){
                ans.add(i+1);
            }

        }
        return ans;

    }


    static void sort(int[] arr){
        int i=0;
        while(i<arr.length){
            int correct= arr[i]-1;
            if(arr[i]>arr.length){
                i++;
            }
            else if(arr[i] != arr[correct]){
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
