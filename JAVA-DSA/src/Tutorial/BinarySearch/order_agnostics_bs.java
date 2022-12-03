package Tutorial.BinarySearch;

import java.util.Arrays;

public class order_agnostics_bs {
    public static void main(String[] args){
        int[] arr={1,3,5,8,9,12,14,20,33};


        //reversing an array
        int[] arr2= new int[arr.length];
        int j=arr.length-1;
        for (int i=0;i<arr.length;i++){
            arr2[i]=arr[j];
            j--;
        }


        int target=20;
        System.out.println(search(arr,target));
        System.out.println(search(arr2,target));


    }
    static int search(int[] nums,int target){

        int start=0;
        int end=nums.length-1;

        //find whether the array is sorted in ascending or descending
        boolean isasc=nums[start]<nums[end];
        while (start<=end){

            int mid=start+(end-start)/2;

            if (target==nums[mid]){
                return mid;
            }

            if (isasc){
                if (target<nums[mid]){
                    end=mid-1;
                }
                else {
                    start=mid+1;
                }
            }
            else {
                if (target>nums[mid]){
                    end=mid-1;
                }
                else {
                    start=mid+1;
                }
            }




        }

        return -1;

    }
}
