package Practice.Array;

import java.util.Arrays;



/*
Plus One

Input: digits = [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Incrementing by one gives 123 + 1 = 124.
Thus, the result should be [1,2,4].
 */
public class q26 {
    public static void main(String[] args) {

//        test case-1;
//        int[] digit = {1, 2, 3};

        //test case-2
//        int[] digit = {9};

        //test case-3
//        int[] digit = {9,8,7,6,5,4,3,2,1,0};
//        expected output: [9,8,7,6,5,4,3,2,1,1]

        //test case-4
//        int[] digit ={9,9};
//        expected output :[1,0,0];

        //test case-4
        int[] digit ={8,9,9,9};

        plusOne(digit);
    }

    static int[] plusOne(int[] digits) {
        int n =digits.length;
     for(int i=n-1;i>=0;i--){
         if(digits[i]<9){
             digits[i]++;
             break;
         }

             digits[i]=0;

     }

     if(digits[0]==0){
         int[] ans = new int[n+1];
         ans[0]=1;
         return ans;

     }
     return digits;
    }
}
