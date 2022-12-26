package Practice.Array;

import java.util.ArrayList;
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
        int[][] matrix={
                {1,10,4,2},
                {9,3,8,7},
                {15,16,17,12}
        };
        System.out.println(luckyNumbers(matrix));

    }
    static List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(i== matrix.length-1 && matrix[i][j]==matrix[i][0]){
//                    System.out.println(matrix[i][j]);
                    ans.add(matrix[i][j]);
                }

            }
        }
        return ans;

    }
}
