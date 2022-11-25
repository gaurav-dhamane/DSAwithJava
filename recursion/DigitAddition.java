package recursion;

public class DigitAddition {
    public static void main(String[] args) {
        System.out.println(additionOfDigits(789));
    }

    static int additionOfDigits(int n){
        if(n%10==n){
            return n;
        }
        int rem =n%10;
        n/=10;
        return rem+ additionOfDigits(n);
    }

}
