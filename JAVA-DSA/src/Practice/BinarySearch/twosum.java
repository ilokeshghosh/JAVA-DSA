package Practice.BinarySearch;
import java.util.Arrays;

public class twosum {
    public static void main(String[] args){
        int[] numbers ={2,7,11,15};
        int target=9;
        System.out.println(Arrays.toString(twoSum(numbers,target)));
    }
    static int[] twoSum(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length-1;

        while(start<=end){
            int mid=start+(end-start)/2;
            if(target==mid+start){
                return new int[]{numbers[start],numbers[mid]};
            }
            if(target>=mid+start){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return new int[]{0,0};
    }
}
