package Tutorial.BinarySearch;

public class peek_index_of_mountain_array {
    public static void main(String[] args){
        int[] arr={0,1,4,8,7,0};
       System.out.println(peakIndexInMountainArray(arr));

    }
    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                //you are in dec part of array
                //this may be tha ans, but look at left
                //this is why end !=mid-1
                end = mid;


            } else {
                //you are in asc part of array

                start = mid + 1;//because we know that mid+1 element > mid element


            }
        }
        //in the end, start== end and pointing to the largest number  cuz of the two checks above
        //start and end are always trying to find max element in the above 2 checks
        //hence, when they are pointing to just one element, that is the max one because  that is what the checks says
       //more elaboration: at every point of time for start and end, they have the best possible answer till that time
       //and if we are saying that onl one ite is remaining, hence cuz of above line that is the best possible answer
        return start;
    }


}
