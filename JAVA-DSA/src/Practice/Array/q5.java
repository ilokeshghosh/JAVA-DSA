package Practice.Array;
import java.util.Arrays;
import java.util.Scanner;

//Shuffle the Array
public class q5 {
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n=in.nextInt();

        int[] nums= new int[2*n];

        System.out.println("Enter the the array");
        for (int i=0;i<2*n;i++){
            nums[i]=in.nextInt();
        }

        int[] ans=new int[nums.length];
        int ti=0;
        for (int i=0;i<n*2;i++){
            if(i%2==0){
                ans[i]=nums[ti];
                ti++;
            }
        }
        int ti1=n;
        for (int i=0;i<n*2;i++){
            if(i%2!=0){
                ans[i]=nums[ti1];
                ti1++;
            }
        }







        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(ans));

    }
}
