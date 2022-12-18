package Practice.Array;
/*

Add to Array-Form of Integer
Input: num = [1,2,0,0], k = 34
Output: [1,2,3,4]
Explanation: 1200 + 34 = 1234
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class q18 {
    public static void main(String[] args){
        int[] num={1,2,0,0};
//        int[] num={9,9,9,9,9,9,9,9,9,9};
//        int[] num={1,2,6,3,0,7,1,7,1,9,7,5,6,6,4,4,0,0,6,3};
        int k=34;
//        int k=516;
        System.out.println( addToArrayForm(num,k));

    }
    static List<Integer> addToArrayForm(int[] num, int k) {
        int n= num.length;
        int i=n-1;
        List<Integer> ans =new ArrayList<>();
        while(i>=0 || k>0){
            if(i>=0){
                ans.add((num[i]+k)%10);
                k= (num[i]+k)/10;
            }
            else{
                ans.add(k%10);
                k/=10;
            }
            i--;
        }
        Collections.reverse(ans);
        return ans;
    }
}
