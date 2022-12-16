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
        System.out.println(oddCells(m,n,indices));
    }


    static int oddCells(int m, int n, int[][] indices) {
        int[][] ans = new int[m][n];
        /*


        ans=[   0, 0, 0
                0, 0, 0,    ]
         */


        int count=0;


       for(int i=0;i<indices.length;i++){
           for (int j=0;j<n;j++){
               ans[indices[i][0]][j]++;
           }
           for (int j=0;j<m;j++){
               ans[j][indices[i][1]]++;
           }

       }

        for(int i=0;i<m;i++) {
            for (int j = 0; j < n; j++) {
                if (ans[i][j] % 2 != 0) {
                    count++;
                }
            }

        }
        return count;

    }












}
