package Practice.Array;
import java.util.Arrays;
import java.util.Scanner;

//Running Sum of 1d Array
public class q3 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int[] nums=new int[4];
        int[] sums=new int[4];

        for (int i=0;i<4;i++){
            System.out.println("Enter the number of "+i+" index");
            nums[i]=in.nextInt();
        }
        sums[0]=nums[0];
        for (int i=1;i<4;i++){
                sums[i]=sums[i-1]+nums[i];
        }
            System.out.println("The number are :"+ Arrays.toString(sums));


    }
}
