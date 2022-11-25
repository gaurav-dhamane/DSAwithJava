package leetcodesolved;
//leetcode: https://leetcode.com/problems/richest-customer-wealth/
public class RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] acc={
                {1,2,3,4},
                {7,5,8,9},
                {8,9,10,11}
        };

        System.out.println(maximumWealth(acc));
    }


    public static int maximumWealth(int[][] accounts) {
        int maxWealth=0;

        for(int i=0;i<accounts.length;i++){
            int wealth=0;
            for(int j=0;j<accounts[i].length;j++){
                wealth+=accounts[i][j];

            }
            if(wealth>maxWealth){
                maxWealth=wealth;
            }
        }
        return maxWealth;
    }
}
