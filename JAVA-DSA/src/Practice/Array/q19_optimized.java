package Practice.Array;

import java.util.Arrays;

public class q19_optimized {
    public static void main(String[] args){

        //        int[][] logs = {
//                {1993, 1999},
//                {2000,2010}
//        };
//
//        int[][] logs = {
//                {2000,2001}
//        };

        int[][] logs = {
                {1950,1961},
                {1960,1971},
                {1970,1981}

        };


        System.out.println(maximumPopulation(logs));
    }
    static  int maximumPopulation(int[][] logs) {
        int[] ans = new int[101];
        int maxYear=1950;
        int maxVal = 0;

        for(int i=0;i<logs.length;i++){

            ans[logs[i][0]-1950]++;
            ans[logs[i][1]-1950]--;


        }
        for(int i=1;i<101;i++){
            ans[i]=ans[i]+ans[i-1];
        }
        for(int i=0;i<101;i++){
            if(ans[i]>maxVal){
                maxVal=ans[i];
                maxYear= i+1950;
            }
        }

        return maxYear;
    }

}
