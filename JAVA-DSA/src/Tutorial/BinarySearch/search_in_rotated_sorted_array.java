package Tutorial.BinarySearch;

public class search_in_rotated_sorted_array {
    //find the pivot(From where your next number are asc) in the array
    //Like : [3,4,5,6,7,0,1,2] here 7 is pivot

    //find pivot
    //search in first half => single BS(0,pivot)
    //Otherwise, search in second half(p+1, end)

    //Q: Find pivot
    public static void main(String[] args){
        int[] arr = {3,4,5,6,7,0,1,2};
        System.out.println(search_pivot(arr));

    }

    public static int search_pivot(int[] arr){
        int start=0;

        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                return mid;

            }
            else {
                start=mid+1;
                if (arr[mid]<arr[mid+1]){
                    end=mid;
                }

            }

        }
        return -1;
    }
}
