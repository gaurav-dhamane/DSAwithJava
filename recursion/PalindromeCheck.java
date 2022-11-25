package recursion;

public class PalindromeCheck {

    public static void main(String[] args) {
        System.out.println(palindrome(456654));

    }
    static boolean palindrome(int n){
        return n==reverse(n);
    }

    static int reverse(int n){

        int ans= reverseNum(n);
        if(n<0){
            return -ans;
        }
        return ans;
    }

    static int reverseNum(int n){
        if(n%10==n){
            return n;
        }
        if(n<0){
            n= -n;
        }

        int rem=n%10;
        n/=10;

        int digits=(int)Math.floor( (Math.log10(n)+1));
        int t= (int)Math.floor( Math.pow(10, digits));

        return  rem*t+reverseNum(n);

    }
}
