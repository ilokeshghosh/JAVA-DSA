package Practice.Array;

import java.util.Arrays;

/*
Reshape the Matrix

Input: mat = [[1,2],[3,4]], r = 1, c = 4
Output: [[1,2,3,4]]

 */
public class q25 {
    public static void main(String[] args) {

        //Test case -1
        int[][] mat={
                {1,2},
                {3,4}
        };

        int r=1;
        int c=4;


        //Test case-2
//        int[][] mat={
//                {1,2},
//                {3,4}
//        };
//
//        int  r = 2;
//        int c = 4;

//        System.out.println(Arrays.toString(matrixReshape(mat,r,c)));
        matrixReshape(mat,r,c);
    }

    static void matrixReshape(int[][] mat, int r, int c) {



        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){

            }
        }

//    return ans;
    }

}
