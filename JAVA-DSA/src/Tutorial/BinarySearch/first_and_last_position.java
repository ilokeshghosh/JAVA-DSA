package Tutorial.BinarySearch;
import java.util.Arrays;
public class first_and_last_position{
    public static void main(String[] args){
        int[] nums={5,7,7,7,7,8,8,10};
        int target=8;

        System.out.println(Arrays.toString(searchRange(nums, target)));

    }
    static int[] searchRange(int[] nums,int target){

        int[] result={-1,-1};
        int start= index(nums,target,true);
        int end=index(nums,target,false);
        result[0]=start;
        result[1]=end;
        return result;
    }
    static int index(int[] nums,int target,boolean check){

        int start=0;
        int ans=-1;
        int end=nums.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;


            if(target<nums[mid]){
                end=mid-1;

            }
            else if(target>nums[mid]){
                start=mid+1;
            }
            else{
                ans= mid;
                if(check){
                    end=mid-1;
                }
                else {
                    start=mid+1;
                }
            }
        }
        return ans;
    }


}