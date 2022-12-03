package Practice.Array;
import java.util.Arrays;

public class q8 {
    public static void main(String[] args){
        int[] nums={6,5,4,8};
        int[] result=new int[nums.length];

        for (int i=0;i<nums.length;i++){
            int count=0;
            for (int j=0;j<nums.length;j++){
                if (nums[j]<nums[i] && j!=i){
                    count++;
                }
            }

                result[i]=count;

        }
        System.out.println(Arrays.toString(result));
    }
}
