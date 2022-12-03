package Tutorial.BinarySearch;

public class binarysearch {
    public static void main(String[] args){
        int[] arr={-10,-5,0,5,10,15,20,25};
        int target=30;
//        int ans=
        System.out.println(search(arr,target));


    }

    //Search for number return index ,if not found return -1
    static int search(int[] num,int target){
        int start=0;
        int end=num.length-1;
        while (start<=end){
//            int mid=(start+end)/2; this may exceed int range
            int mid=start+(end-start)/2;
            if (target<num[mid]){
                end=mid-1;
            }
            else if(target>num[mid]){
                start=mid+1;
            }
            else {
                return mid;
            }


        }
        return -1;
    }

}
