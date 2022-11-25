package leetcodesolved;
// leetcode problem 118 : https://leetcode.com/problems/pascals-triangle/
import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {

    public static void main(String[] args) {

        List<List<Integer>> arr = generate(5);

        for (List<Integer> el:arr) {
            System.out.println(el);
        }



    }



    public static List<List<Integer>> generate(int numRows) {

        List<List<Integer>> li= new ArrayList<>();

        for(int i=0;i<numRows;i++){
            li.add(new ArrayList<Integer>());
            for(int j=0;j<=i;j++){
                li.get(i).add(1);
            }
        }

        for(int i=2;i<numRows;i++){
            for(int j=1;j<li.get(i).size()-1;j++){
                int el=li.get(i-1).get(j)+li.get(i-1).get(j-1);
                li.get(i).set(j,el);
            }
        }

        return li;

    }
}
