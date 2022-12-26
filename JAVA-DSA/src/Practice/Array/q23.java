package Practice.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*

Lucky Numbers in a Matrix

Input: matrix = [[3,7,8],[9,11,13],[15,16,17]]
Output: [15]
Explanation: 15 is the only lucky number since it is the minimum in its row and the maximum in its column.

 */
public class q23 {
    public static void main(String[] args){

        //test case -1
//        int[][] matrix={
//                {3,7,8},
//                {9,11,13},
//                {15,16,17}
//        };

//        test case-2
//        int[][] matrix={
//                {1,10,4,2},
//                {9,3,8,7},
//                {15,16,17,12}
//        };


        //test case-3
//        int[][] matrix={
//                {7,8},
//                {1,2}
//
//        };


        //test case -4
        int[][] matrix ={
                {3,6},
                {7,1},
                {5,2},
                {4,8}

        };

        System.out.println(luckyNumbers(matrix));

    }
    static List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> ans = new ArrayList<>();

        for(int row = 0;row<matrix.length;row++){
            for(int col=0;col<matrix[row].length;col++){
                if(isMinInRow(matrix,matrix[row][col],row) && isMaxIncol(matrix,matrix[row][col],col)){
                    ans.add(matrix[row][col]);
                }
            }
        }

        return ans;

    }

    static boolean isMinInRow(int[][] row,int number ,int rowNum){
        int min=0;
        boolean ans = false;
        for(int col=0;col<row[rowNum].length;col++){
            if(row[rowNum][col]<number){
                return false;
            }
        }
        return true;
    }
    static boolean isMaxIncol(int[][] col,int number,int colNum){
        boolean ans = false;
        for(int i=0;i<col.length;i++){
            if(number<col[i][colNum]){
                return false;
            }
        }
        return true;
    }
}
