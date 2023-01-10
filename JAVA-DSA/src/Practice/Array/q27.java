package Practice.Array;

import java.util.Arrays;

/*


Remove Duplicates from Sorted Array


int[] nums = [...]; // Input array
int[] expectedNums = [...]; // The expected answer with correct length

int k = removeDuplicates(nums); // Calls your implementation

assert k == expectedNums.length;
for (int i = 0; i < k; i++) {
    assert nums[i] == expectedNums[i];
}


 */
public class q27 {
    public static void main(String[] args) {


//        test case-1
        int[] nums ={1, 1, 2};
//        output : 2


        //test case-2
//        int[] nums= {0,0,1,1,1,2,2,3,3,4};
//        output : 5
        System.out.println(removeDuplicates(nums));


    }

    static int removeDuplicates(int[] nums) {
        int count=1;

        int n=nums.length;
        int[] ans = new int[n];


        for(int i=1;i<n;i++){
            if(nums[i-1]!=nums[i]){

                count++;
            }

        }
        System.out.println(Arrays.toString(ans));
        return count;
    }

}
