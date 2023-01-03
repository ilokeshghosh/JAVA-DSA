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
        int[] digit = {9,8,7,6,5,4,3,2,1,0};
//        expected output: [9,8,7,6,5,4,3,2,1,1]


        plusOne(digit);
    }

    static void plusOne(int[] digits) {
//        int carry =0;

        digits[digits.length-1]++;
//        int num= digits[digits.length-1];

        for (int i=0;i<digits.length;i++){
            int carry =digits[i]/10;
            if(carry>0){
                i--;
                digits[i]+=carry;

            }
//            System.out.println(carry);
            System.out.println(digits[i]);
        }




//

    }
}
