package miscellaneous_codes;

public class Bitwise{
    public static void main(String[] args) {
        
        int[] arr={2,3,4,5,2,3,5};

        // System.out.println(findUnique(arr));
        System.out.println(findIthBit(182));
        
    }

    static int  findUnique(int[] arr) {
        int unique=0;

        for (int i : arr) {
           unique= unique ^ i;
        }

        return unique;
    }

    static int findIthBit(int n){

        int mask=1<<(n-1);

        return n&mask;

    }
}