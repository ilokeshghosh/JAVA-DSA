package Practice.Array.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Kids With the Greatest Number of Candies

Input: candies = [2,3,5,1,3], extraCandies = 3
Output: [true,true,true,false,true]
Explanation: If you give all extraCandies to:
- Kid 1, they will have 2 + 3 = 5 candies, which is the greatest among the kids.
- Kid 2, they will have 3 + 3 = 6 candies, which is the greatest among the kids.
- Kid 3, they will have 5 + 3 = 8 candies, which is the greatest among the kids.
- Kid 4, they will have 1 + 3 = 4 candies, which is not the greatest among the kids.
- Kid 5, they will have 3 + 3 = 6 candies, which is the greatest among the kids.
 */
public class Q6 {
    public static void main(String[] args){
        int[] candies={2,3,5,1,3};
        int extraCandies = 3;
//        boolean[] ans=new boolean[candies.length];
        int length = candies.length;
        List<Boolean> ans = new ArrayList<Boolean>(length+1);
        for(int i=0;i<candies.length;i++){
            if(check(candies,candies[i]+extraCandies)){
                ans.add(i, true);
            }
            else {
              ans.add(i,false);
            }
        }

        for(int i=0;i<length;i++){
            System.out.println(ans.get(i));
        }

    }
    static boolean check(int[] candies,int num){
        boolean ans=false;
        int max=-1;
        for(int i=0;i<candies.length;i++){
            if(num>=candies[i]){
                max=num;
            }
            else {
               return false;
            }

        }
        if(max==num){
            return true;
        }else{
            return false;
        }
    }
}
