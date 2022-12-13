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

        System.out.println(Arrays.deepToString(image));
    }
    static int[][] flipAndInvertImage(int[][] image) {

        for(int i=0;i<image.length;i++){
            for(int j=image[i].length;j>0;j--){
                Collections.reverse(Arrays.asList(image));

            }
        }
        System.out.println(Arrays.toString(image));
        return image;
    }
}
