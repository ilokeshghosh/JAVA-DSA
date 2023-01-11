package Practice.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

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
//        int[] nums ={1, 1, 2};
//        output : 2


        //test case-2
        int[] nums= {0,0,1,1,1,2,2,3,3,4};
//        output : 5
        System.out.println(removeDuplicates(nums));


    }

    static int removeDuplicates(int[] nums) {

        int i=0;

           for(int j=i+1;j<nums.length;j++){
               if(nums[i]!=nums[j]){
                   i++;
                   nums[i]=nums[j];


               }
           }

//        System.out.println(Arrays.toString(nums));
       return i+1;
    }

}
