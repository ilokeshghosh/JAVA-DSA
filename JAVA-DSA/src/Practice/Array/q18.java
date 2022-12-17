package Practice.Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*

Add to Array-Form of Integer
Input: num = [1,2,0,0], k = 34
Output: [1,2,3,4]
Explanation: 1200 + 34 = 1234
 */
public class q18 {
    public static void main(String[] args){
//        int[] num={1,2,0,0};
//        int[] num={9,9,9,9,9,9,9,9,9,9};
        long[] num={1,2,6,3,0,7,1,7,1,9,7,5,6,6,4,4,0,0,6,3};
        int k=516;
        addToArrayForm(num,k);
    }
    static List<Integer> addToArrayForm(long[] num, int k) {

        List<Integer> ans =new ArrayList<>(num.length);
        long sum=0L;
        long onum=0L;
        for(int i=0;i<num.length;i++){
            onum=(onum*10)+num[i];
            sum=(long) k+onum;


        }
        System.out.println(onum);
        System.out.println(sum);


        while(sum!=0){
            long r=(long)sum%10;
            ans.add((int) r);
            sum/=10;
        }
        Collections.reverse(ans);
        System.out.println(ans);
        return ans;
    }
}
