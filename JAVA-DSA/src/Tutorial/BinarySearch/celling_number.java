package Tutorial.BinarySearch;

public class celling_number {
    public static void main(String[] args){
        int[] arr={2,3,5,9,14,16,18};
        int target=17;
        System.out.println(celing(arr,target));
    }
    static int celing(int[] nums,int target){
        int start=0;
        int end=nums.length-1;
        int ans=0;
        if(target>nums[nums.length-1]){
            return -1;
        }
        while(start<=end){
            int mid=start+(end-start)/2;


            if(target<nums[mid]){
                end=mid-1;
//                if(start==end && target<nums[end]){
//                    return nums[end];
//                }

            }
            else if (target==nums[mid]){
                return nums[mid];

            } else {
                start=mid+1;
            }


        }
        return nums[start];
    }


}
