package Tutorial.BinarySearch;

///have some issue in code
public class position_of_sorted_infinite_array {
    public static void main(String[] args){

//        Size of array by using index
//        size=end-(start-1);
//        or;
//        size=end-start+1;
        int[] arr = new int[]{3, 5, 7, 9, 10, 90,
                100, 130, 140, 160, 170};
        int target=130;
        System.out.println(ans(arr,target));

    }

    static int ans(int[] arr,int target){
//        finding the range
        int start=0; //initial size is 2;
        int end=1;

        while(target>arr[end]){
            int temp=end+1;
//          end=previous end + size of box *2;
            end=end+(end-start+1)*2;
            start=temp;

        }
    return binarysearch(arr,target,start,end);
    }
    static int binarysearch(int[] arr ,int target,int start ,int end){

        while(start<=end){
            int mid=start+(end-start)/2;
            if(target<arr[mid]){
            end=mid-1;
            }
            else if(target>arr[mid]){
                start=mid+1;
            }
            else {
                return mid;
            }
        }
        return -1;
    }



}
