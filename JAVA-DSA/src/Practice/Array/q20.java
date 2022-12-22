package Practice.Array;

import java.util.Arrays;

/*
Determine Whether Matrix Can Be Obtained By Rotation
Input: mat = [
               [0,1],
               [1,0]
        ]

target = [
            [1,0],
            [0,1]
         ]
Output: true
Explanation: We can rotate mat 90 degrees clockwise to make mat equal target.
 */
public class q20 {
    public static void main(String[] args){

//        test case-1
//        int[][] mat = {
//                {0,1},
//                {1,0}
//        };
//
//        int[][] target = {
//                {1,0},
//                {0,1}
//        };


//        test case-2
        int[][] mat = {
                {0,0,0},
                {0,1,0},
                {1,1,1}
        };

        int[][] target = {
                {1,1,1},
                {0,1,0},
                {0,0,0},
        };


//        test case-3
//        int[][] mat={
//                {0,1},
//                {1,1}
//        };
//        int[][] target ={
//                {1,0},
//                {0,1}
//        };

        System.out.println(findRotation(mat,target));
    }
    static boolean findRotation(int[][] mat, int[][] target) {
        for(int i=0;i<4;i++){
            if(check(mat,target)){
                return true;
            }
            rotate(mat);
        }
       return false;

    }

    //Check
    static boolean check(int[][] mat ,int[][] target){

        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat.length;j++){
                if(mat[i][j]!=target[i][j]){
                    return false;
                }

                            }
        }
        return true;
    }

    static void rotate(int[][]mat){
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<i;j++){
                int temp=mat[i][j];
                mat[i][j]= mat[j][i];
                mat[j][i]=temp;
            }
        }
        int start=0;
        int end=mat.length-1;
        while(start<=end){
            for(int i=0;i<mat.length;i++){
                int temp = mat[i][start];
                mat[i][start]=mat[i][end];
                mat[i][end]=temp;
            }
            start++;
            end--;
        }
    }
}
