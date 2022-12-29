package Practice.Array;

import java.util.Arrays;

//import static jdk.vm.ci.code.CodeUtil.K;

/*

Maximum Subarray
Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.

 */
public class q24 {
    public static void main(String[] args) {
    int[] nums={-2,1,-3,4,-1,2,1,-5,4};
//    int[] nums={-2,-1};
//    int[] nums={-3,-2,-2,-3};






    System.out.println(maxSubArray(nums));

    }

    static int maxSubArray(int[] nums) {
        int max =Integer.MIN_VALUE;
        int sum=0;
        int[] ans = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            if(sum>max){
                max=sum;
            }
            if(sum<0) {
                sum=0;
            }
        }
        System.out.println(Integer.MIN_VALUE);
        return max;

    }
}
