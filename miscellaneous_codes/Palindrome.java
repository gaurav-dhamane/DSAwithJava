package miscellaneous_codes;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a string or a number: ");
        String s= sc.next();

        s=s.toLowerCase();

        int start=0;
        int end=s.length()-1;
        boolean isPal=false;
        while(start<=end){
            if(s.charAt(start)==s.charAt(end)){
                start++;
                end--;
                isPal=true;
            }
            else{
                isPal=false;
                break;
            }
        }
        System.out.println(isPal);
    }
}
