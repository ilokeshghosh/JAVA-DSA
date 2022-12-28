package Practice.Array;

import java.util.Arrays;

/*

Maximum Subarray
Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.

 */
public class q24 {
    public static void main(String[] args) {
    int[] nums={-2,1,-3,4,-1,2,1,-5,4};
    System.out.println(maxSubArray(nums));

    }

    static int maxSubArray(int[] nums) {
        int x=0;
        int max =nums[0];
        int[] ans = new int[nums.length];jk
        for(int i=1;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(nums[i]>nums[j]){
                    max=nums[i];
                    x=i;
                }
                else {
                    max=nums[j];
                    x=j;
                }
            }
            System.out.println(max);
            nums[x]=0;
        }
        System.out.println(Arrays.toString(ans));
        return 0;
    }





}
