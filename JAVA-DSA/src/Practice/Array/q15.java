package Practice.Array;
/*

Matrix Diagonal Sum
Input: mat = [[1,2,3],
              [4,5,6],
              [7,8,9]]
Output: 25
Explanation: Diagonals sum: 1 + 5 + 9 + 3 + 7 = 25
Notice that element mat[1][1] = 5 is counted only once.

 */
public class q15 {
    public static void main(String[] args){

        //Test Case-1
//        int[][] mat = {
//                {1,2,3},
//                {4,5,6},
//                {7,8,9}
//        };

        //test case-2;
//        int[][] mat = {
//                {1,1,1,1},
//                {1,1,1,1},
//                {1,1,1,1},
//                {1,1,1,1}
//
//        };
        //test case-3
        int[][] mat = {
                {5},

        };

        diagonalSum(mat);

    }
    static void diagonalSum(int[][] mat) {
        int sum=0;
        for(int i=0;i<mat.length;){
            for(int j=0;j< mat.length;j++){
//                System.out.println(mat[i][j]);
                sum+=mat[i][j];

                if(mat.length%2!=0 && i==j){
                    mat[i][j]=0;
                }

                i++;
            }

            i=0;
            for(int k=mat.length-1;k>=0;k--){
//                System.out.println(mat[i][k]);
                sum+=mat[i][k];
                i++;
            }
        }
        System.out.println(sum);
    }
}
