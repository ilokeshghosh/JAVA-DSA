package Practice.Array;

import java.util.Arrays;

/*

Maximum Population Year
Input: logs = [[1993,1999],[2000,2010]]
Output: 1993
Explanation: The maximum population is 1, and 1993 is the earliest year with this population.
 */
public class q19 {
    public static void main(String[] args){
//        int[][] logs = {
//                {1993, 1999},
//                {2000,2010}
//        };
//
        int[][] logs = {
                {2000,2001}
        };

//        int[][] logs = {
//                {1950,1961},
//                {1960,1971},
//                {1970,1981}
//
//        };


        System.out.println(maximumPopulation(logs));

    }

    static  int maximumPopulation(int[][] logs) {
        int[] ans= new int[101];
        int maxYear=1950;
        int maxVal=0;
        for(int i=0;i<logs.length;i++){
            for(int j=logs[i][0];j<logs[i][1];j++){
                ans[j-1950]++;
            }
        }
        for(int j=0;j<101;j++){
            if(ans[j]>maxVal){
                maxVal=ans[j];
                maxYear=j+1950;
            }
        }

        return maxYear;
    }
  }
