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

    static int[][] matrixReshape(int[][] mat, int r, int c) {

       int currentR=0;
       int currentC=0;

       if(r>1){
           c/=2;
       }
        int[][] ans = new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(currentR<mat.length && currentC<mat[0].length){
                    int sum = setValue(mat,currentR,currentC);
                    ans[i][j] = sum;
                    currentC++;
//                    System.out.print(ans[i][j]);
                }
                if(currentC== mat[0].length){
                    currentR++;
                    currentC=0;
                }
            }
        }
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                System.out.print(ans[i][j]);
            }
            System.out.println();
        }
    return ans;
    }
    static  int setValue(int[][] mat, int currentR, int currentC){
       return mat[currentR][currentC];
    }





}
