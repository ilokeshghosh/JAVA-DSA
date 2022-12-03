
package Practice.Array;
import java.util.Scanner;

public class q7 {
    public static void main(String[] args){
//        Scanner in = new Scanner(System.in);
        int[] nums={1,2,3};
        int count=0;
        for (int i=0;i<nums.length;i++){

            for (int j=0;j<nums.length;j++){
                if (nums[i]==nums[j] && i<j){
                    count++;
                }


            }
        }
        System.out.println(count);
    }
}
