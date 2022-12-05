package Practice.Array.Test;

import java.util.Arrays;

/*

Shuffle the Array

Input: nums = [2,5,1,3,4,7], n = 3
Output: [2,3,5,4,1,7]
Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].

 */
public class Q5 {
    public static void main(String[] args){
        int[] nums= {2,5,1,3,4,7};
        int n=3;
        int j=1;
        int k=0;
       int[] ans= new int[nums.length];

       for (int i=n;i<nums.length;i++){
           ans[j]=nums[i];
           j+=2;
       }
       for (int i=0;i<nums.length;i+=2){
          ans[i]=nums[k];
          k++;
       }


        System.out.println(Arrays.toString(ans));
    }
}
