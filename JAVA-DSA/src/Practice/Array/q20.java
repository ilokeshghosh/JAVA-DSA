package Practice.Array;

import java.util.Arrays;

/*
Determine Whether Matrix Can Be Obtained By Rotation
Input: mat = [[0,1],[1,0]], target = [[1,0],[0,1]]
Output: true
Explanation: We can rotate mat 90 degrees clockwise to make mat equal target.
 */
public class q20 {
    public static void main(String[] args){
        int[][] mat = {
                {0,1},
                {1,0}
        };

        int[][] target = {
                {1,0},
                {0,1}
        };
        System.out.println(findRotation(mat,target));
    }
    static boolean findRotation(int[][] mat, int[][] target) {
        int[][] ans= new int[mat.length][mat.length];
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat.length;j++){
                ans[i][j]= mat[mat[i][j]][mat[j][i]];

            }
        }

        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat.length;j++){

                System.out.print(ans[i][j]);
            }
            System.out.println();
        }

        return true;
    }
}
