package searching;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr= {1,53,61,64,16,12,14};
        System.out.print("Enter a number: ");
        int val=-1;
        try {
            val= findNum(arr, in.nextInt());

        } catch (Exception e) {

            System.out.println(e);
        }
        in.close();
        if (val>0){

            System.out.println("Element found at index: " +val);
        }
        else{
            System.out.println("Entered number is not in array arr[]");
        }
    }
    static int  findNum(int[] arr, int element){

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==element){
                return i;
            }

        }

        return -1;
    }

}
