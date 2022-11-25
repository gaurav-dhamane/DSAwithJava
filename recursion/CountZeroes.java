package recursion;

public class CountZeroes {
    public static void main(String[] args) {
        System.out.println(countZeroes(100050));
    }

    static int countZeroes(int n){
        return countZeroes(n,0);
    }

    static int countZeroes(int n,int count){
        // if((int)Math.floor( (Math.log10(n)))==0){
        //     return count;
        // }
        if(n==0){
            return count;
        }

        int rem= n%10;
        if(rem==0){
            return countZeroes(n/10, count+1);

        }

        return countZeroes(n/10, count);
    }
}
