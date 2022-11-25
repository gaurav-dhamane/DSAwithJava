package leetcodesolved;

// leetcode: https://leetcode.com/problems/fibonacci-number/

import java.util.Scanner;

public class nthFibonacciNum {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner( System.in);
        while(true){
            int m= sc.nextInt();
            int n= fibo(m);
            System.out.println("Number: "+n);
        }
        
    }

    static int fibo(int n){
        if(n>45){
            return -1;
        }
        if(n<2){
            return n;
        }

        return fibo(n-1)+fibo(n-2);

    }

    static int fibo1(int n){
        return 0;

    }
}
