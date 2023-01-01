package Practice.Array;

import java.util.Arrays;

/*
Reshape the Matrix

Input: mat = [[1,2],[3,4]], r = 1, c = 4
Output: [[1,2,3,4]]

 */
public class q25 {

    static int x=0;
    static int y=0;
    public static void main(String[] args) {

        //Test case -1
//        int[][] mat={
//                {1,2},
//                {3,4}
//        };
//
//        int r=1;
//        int c=4;


        //Test case-2
        int[][] mat={
                {1,2},
                {3,4}
        };

        int  r = 2;
        int c = 4;

//        System.out.println(Arrays.toString(matrixReshape(mat,r,c)));
        matrixReshape(mat,r,c);
    }

    static void matrixReshape(int[][] mat, int r, int c) {
        int[][] ans = new int[r][c];
        int mrow=0;

       int tcol=0;

        for(int row=0;row<r;row++){
            for(int col=tcol;col<c;col++){
                ans[row][col]=getValue(mat,row,col);
                System.out.println(ans[row][col]);
                tcol++;
            }
        }



//    return ans;
    }
    static  int getValue(int[][] mat,int mrow,int mcol){

       return mat[mrow][mcol];

    }




}
