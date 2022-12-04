package Practice.Array.Test;

import java.util.Arrays;

/*
Richest Customer Wealth

Input: accounts = [[1,2,3],[3,2,1]]]
Output: 6
Explanation:
1st customer has wealth = 1 + 2 + 3 = 6
2nd customer has wealth = 3 + 2 + 1 = 6
Both customers are considered the richest with a wealth of 6 each, so return 6.
 */
public class Q4 {
    public static void main(String[] args){
        int[][] accounts = {
                {2,8,7},
                {7,1,3},
                {1,9,5}
        };
        int[] sum= new int[accounts.length];
        for(int row=0;row<accounts.length;row++){
            sum[row]=0;
            for(int col=0;col<accounts[row].length;col++){
                sum[row]+=accounts[row][col];

            }

        }
       int max=sum[0];

        for(int i=1;i<sum.length;i++){
            if(sum[i]>max){
                max=sum[i];
            }

        }
        System.out.println(max);
    }
}
