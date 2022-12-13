package Practice.Array;

import java.util.Arrays;

/*

Find the Highest Altitude

Input: gain = [-5,1,5,0,-7]
Output: 1
Explanation: The altitudes are [0,-5,-4,1,1,-6]. The highest is 1.
 */
public class q12 {
    public static void main(String[] args){
        int[] gain = {-5,1,5,0,-7};
        System.out.println(largestAltitude(gain));
    }
    static int largestAltitude(int[] gain) {
        int point=0;
        int[] ans = new int[gain.length+1];
        ans[0]=0;
        int altitude=0;
        int max=0;
        for(int i=0;i<gain.length;i++){
            point+=gain[i];
            ans[i+1]=point;
        }


        return check(ans);
    }
    static int check(int[] ans){
        int max=ans[0];

        for(int i=1;i<ans.length;i++){
            if(ans[i]>max){
                max=ans[i];

            }
        }
        return max;
    }
}
