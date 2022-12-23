package Practice.Array;

import java.util.Arrays;

/*

Two Sum
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 */
public class q21_optimized {
    public static void main(String[] args) {
        //test case -1
        int[] nums= {2,7,11,15};
        int target=9;

        //test case-2
//        int[] nums= {3,2,4};
//        int target=6;


//      test case 3
//        int[] nums= {3,3};
//        int target=6;



        System.out.println(Arrays.toString(twoSum(nums,target)));

    }
    public static int[] twoSum(int[] nums, int target) {


         if(target == nums[0] + nums[1]) {
                return new int[] {0,1};
        }

        int length = nums.length;

        for (int i = length - 1; i > 0; i--) {
            for (int j = i - 1; j >= 0; j--) {
                if (target == nums[i] + nums[j]) {
                    return new int[]{i, j};
                }
            }
        }
        return null;







    }
}
