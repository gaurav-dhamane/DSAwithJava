package leetcodesolved;
//leetcode: https://leetcode.com/problems/find-smallest-letter-greater-than-target/


public class NextGreatestLetter {
    public static void main(String[] args) {
        char[] arr={'c','f','j'};

        System.out.println(nextGreatestLetter(arr,'c'));
    }

    public static char nextGreatestLetter(char[] letters, char target) {
        int start= 0;
        int end= letters.length-1;
        int mid;

        while(start<=end){
            mid= start+ (end-start)/2;

            if (target<letters[mid]){
                end= mid-1;
            }
            else {
                start= mid+1;

            }
        }
        if (start>=letters.length){
            return letters[0];
        }

        return letters[start];



    }
}
