package miscellaneous_codes;
// number of elements in array with even digits
public class EvenDigits {
    public static void main(String[] args) {
        // find number in array with even number of digits
        int[] arr= {5,98,78,2,45,8888};

        System.out.println(countEven(arr));


    }
    static int countEven(int[] nums) {
        int count = 0 ;
        for (int i :nums) {
            int numOfDig=  (int) Math.log10(i) +1;
            boolean s= numOfDig%2==0 ;
            if (s){
                count++;
            }
        }
        return count;
    }

   
}
