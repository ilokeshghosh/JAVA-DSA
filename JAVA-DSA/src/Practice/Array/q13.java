package Practice.Array;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/*

Flipping an Image

Input: image = [[1,1,0],[1,0,1],[0,0,0]]
Output: [[1,0,0],[0,1,0],[1,1,1]]
Explanation: First reverse each row: [[0,1,1],[1,0,1],[0,0,0]].
Then, invert the image: [[1,0,0],[0,1,0],[1,1,1]]

 */
public class q13 {
    public static void main(String[] args){
        int[][] image= {
                {1,1,0},
                {1,0,1},
                {0,0,0}
        };

//        System.out.println(Arrays.deepToString(image));
        System.out.println(Arrays.deepToString(flipAndInvertImage(image)));
    }
    static int[][] flipAndInvertImage(int[][] image) {
        int[][] ans = new int[image.length][image.length];
       for (int i=0;i<image.length;i++){
           int c=0;
           for (int j=image[i].length-1;j>=0;j--){
            ans[i][c]=image[i][j];
            c++;
           }

       }

       for (int i=0;i<image.length;i++){
           for (int j=0;j<image[i].length;j++){
               if(ans[i][j]==1){
                   ans[i][j]=0;
               }
               else {
                   ans[i][j]=1;
               }

           }

       }


    return ans;
    }
}
