package Tutorial.LinearSearch;
import java.util.Arrays;
import java.util.List;

public class search2darray {
    public static void main(String[] args) {
        int[][] arr={
                {1,2},
                {3,4,10,15},
                {5,6,22},
                {7,8}
        };
        int target=15;
//        search(arr,target);
        System.out.println(search(arr,target));
        System.out.println(max(arr));
    }

    //Searching integer in 2-d array;
    static List<Integer> search(int[][] arr, int tar){
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col]==tar){
                    return Arrays.asList(row,col);
                }
            }
            System.out.println();
        }
        return Arrays.asList(0,0);
    }

    //Finding the maximum number in 2-d array
    static int max(int[][] arr){
        int max=arr[0][0];
        for(int row=0;row<arr.length;row++){
            for(int col=0;col<arr[row].length;col++){
                if(arr[row][col]>max){
                    max=arr[row][col];
                }
            }
//            System.out.println();
        }
        return max;
    }
}
