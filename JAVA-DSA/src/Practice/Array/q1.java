package Practice.Array;
import java.util.Arrays;
import java.util.Scanner;

//Building and array from permutation
public class q1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
//        System.out.println("Enter the number ");

        int[] nums={0,2,1,5,3,4};
        int[] ans= premuted(nums);

        System.out.println(Arrays.toString(ans));
//        ans=nums[nums[0]],nums[nums[1]],nums[nums[2]],nums[nums[3]],nums[nums[4]],nums[nums[5]];
    }
    static int[] premuted(int[] arr){
        int[] temp=new int[arr.length];
        int[] temp2=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            temp[i]= arr[arr[i]];

        }
        return temp;


    }

}
