package Practice.Array;

import java.util.Arrays;

/*

Transpose Matrix
Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [[1,4,7],[2,5,8],[3,6,9]]
 */
public class q17 {
    public static void main(String[] args){
//        int[][] matrix = {
//                {1,2,3},
//                {4,5,6},
//                {7,8,9}
//        };

        int[][] matrix = {
                {1,2,3},
                {4,5,6}

        };
        System.out.println(Arrays.deepToString(transpose(matrix)));
    }
    static int[][] transpose(int[][] matrix) {

        int[][] ans = new int[matrix[0].length][matrix.length];

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                ans[j][i]=matrix[i][j];
            }
        }
        return ans;
    }

}
