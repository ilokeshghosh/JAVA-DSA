package Practice.Array;
/*

Find Numbers with Even Number of Digits
Input: nums = [12,345,2,6,7896]
Output: 2
Explanation:
12 contains 2 digits (even number of digits).
345 contains 3 digits (odd number of digits).
2 contains 1 digit (odd number of digits).
6 contains 1 digit (odd number of digits).
7896 contains 4 digits (even number of digits).
Therefore only 12 and 7896 contain an even number of digits.

 */
public class q16 {
    public static void main(String[] args){
//        int[] nums = {12,345,2,6,7896};
        int[] nums = {555,901,482,1771};
        System.out.println(findNumbers(nums));
    }

    static int findNumbers(int[] nums) {
        int evenCount=0;
        int ncount=0;
        for(int i=0;i<nums.length;i++){

            while(nums[i]>0){
                int r=nums[i]%10;
                ncount++;
                nums[i]/=10;

            }
            if(ncount%2==0){
                evenCount++;
            }
        }
        return evenCount;
    }

}
