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
//        int[][] mat={
//                {1,2},
//                {3,4}
//        };
//
//        int  r = 2;
//        int c = 4;


        //Test case-3
//        int[][] mat={
//
//
//                {1,2},
//                {3,4}
//        };
//
//        int  r = 4;
//        int c = 1;

        //test case-4
//        int[][] mat={
//
//
//                {1,2,3,4}
//
//        };
//
//        int  r = 1;
//        int c = 4;

        //test case-5
        int[][] mat={


                {1,2}

        };

        int  r = 1;
        int c = 1;

//        System.out.println(Arrays.toString(matrixReshape(mat,r,c)));
        matrixReshape(mat,r,c);
    }

    static int[][] matrixReshape(int[][] mat, int r, int c) {

       int currentR=0;
       int currentC=0;

       if((mat.length*mat[0].length)!=(r*c) || (mat.length*mat[0].length)%r!=0){
           return mat;
       }
        int[][] ans = new int[r][c];
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){


                    ans[currentR][currentC] = mat[i][j];
                    currentC++;
//                    System.out.print(ans[i][j]);

                if(currentC== c){
                    currentR++;
                    currentC=0;
                }
            }
        }

    return ans;
    }






}
