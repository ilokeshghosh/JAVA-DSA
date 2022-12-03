package Tutorial.BinarySearchIn_2D;

import java.util.Arrays;

public class SortedMatrix {
    public static void main(String[] args){

        int[][] arr={
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}


        };
        int target=9;
        System.out.println(Arrays.toString(search(arr,target)));


    }
    //search in the row provided between the column provided
    static int[] SimpleBS(int[][] matrix, int row, int cStart, int cEnd, int target){
        while(cStart <= cEnd){
            int mid= cStart+(cEnd-cStart)/2;
            if(matrix[row][mid] ==  target){
                return new int[]{row, mid};
            }
            if(matrix[row][mid]<target){
                cStart = mid+1;

            }else {
                cEnd=mid-1;
            }


        }
        return new int[]{-1, -1};
    }

    static int[] search(int[][] matrix,int target){
        int row=matrix.length;
        int col=matrix[0].length;// be cautious, matrix may be empty;
        int rStart = 0;
        int rEnd = row-1;
        int cMid = col/2;
        if(row==1){
                return SimpleBS(matrix, 0, 0,col-1, target);
        }

        //run the loop till 2 rows are remaining
        while(rStart < (rEnd - 1)){ //while this is true it will have more than 2 rows
                int rmid = rStart + (rEnd - rStart)/2;

                if(matrix[rmid][cMid]== target){
                    return new int[]{rmid , cMid};
                }
                if(matrix[rmid][cMid]<target) {
                    rStart = rmid;
                }else{
                   rEnd = rmid;
                }
        }
        //now we have two rows
        //check whether the target is in the col of 2rows
        if(matrix[rStart][cMid] == target){
            return new int[]{rStart, cMid};
        }
        if(matrix[rStart+1][cMid]==target){
            return new int[]{rStart+1, cMid};
        }

        //search in 1st half(row start to mid col-1)
        if(target <= matrix[rStart][cMid-1]){
          return SimpleBS(matrix,rStart,0,cMid-1,target);
        }
        //search in 2nd half(row start to mid-column+1)
        if(target>=matrix[rStart][cMid+1] && target <= matrix[rStart][col-1]){
           return SimpleBS(matrix,rStart,cMid+1,col-1,target);
        }
        //search in 3rd half(row start +1 to column mid -1)
        if(target<=matrix[rStart+1][cMid-1]){
            return SimpleBS(matrix,rStart+1,0,cMid-1,target);
        }
        //search in 4th half(row start+1 to column mid+1) i.e target>=matrix[rStart+1][cMid+1];
       else {
            return SimpleBS(matrix,rStart+1,cMid+1,col-1,target);
        }
    }
}
