package Practice.Array;
import java.util.Arrays;
//Building and array from permutation
public class q1test {
    public static void main(String[] args) {

//       nums= new int[6];
        int[]  nums = {0,2,1,5,3,4};
        int[] ans= new int[6];

        for(int i=0;i<nums.length;i++){
            ans[i]= nums[nums[i]];

        }
        System.out.println(Arrays.toString(ans));
    }


}
