package Tutorial.LinearSearch;
//Q. Search for 3 in the range of index[1,4]
public class Searchinrange {
    public static void main(String[] args) {
        int[] arr= {18,12,-7,3,14,28};
        int start=1;
        int end=4;
        int target=14;
        System.out.println(range(arr,start,end,target));

    }
    static int range(int[] arr,int start,int end,int tar){
        for(int i=start;i<=end;i++){
            if(tar==arr[i]){
                return i;
            }
        }
        return -1;
    }
}
