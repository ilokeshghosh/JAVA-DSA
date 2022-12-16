package Practice.Array;

import java.util.Arrays;

/*

Cells with Odd Values in a Matrix

Input: m = 2, n = 3, indices = [[0,1],[1,1]]
Output: 6
Explanation: Initial matrix = [[0,0,0],[0,0,0]].
After applying first increment it becomes [[1,2,1],[0,1,0]].
The final matrix is [[1,3,1],[1,3,1]], which contains 6 odd numbers.


 */
public class q14 {
    public static void main(String[] args){
        int[][] indices = {
                {0,1},
                {1,1}
        };
        int m=2;
        int n=3;
        oddCells(m,n,indices);
    }


    static void oddCells(int m, int n, int[][] indices) {
        int[][] ans = new int[m][n];
        /*


        ans=[   0, 0, 0
                0, 0, 0,    ]
         */



        for (int i = 0; i < indices.length; i++) {
            for (int j = 0; j < m; j++) {
                ans[indices[i][j]][j]++;
            }

//       for(int i=0;i<indices.length;i++){
//           for (int j=0;j<n;j++){
//               ans[indices[i][j]][j]++;
//           }
//           for (int j=0;j<m;j++){
//               ans[i][indices[i][j]]++;
//           }
//
//       }

        }



        for (int i = 0; i < m; i++) {


            for (int j = 0; j < n; j++) {
                System.out.println(ans[m][n]);
            }


        }








    }





}
