package Practice.Array.Test;
//Running Sum of 1d Array

import java.util.Arrays;
import java.util.Scanner;

/*
Input: nums = [1,2,3,4]
Output: [1,3,6,10]
Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
 */
public class Q3 {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        int[] nums= {1,2,3,4};
        int[] ans= new int[nums.length];
       ans[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            ans[i]=ans[i-1]+nums[i];

        }
        System.out.println(Arrays.toString(ans));
    }
}
