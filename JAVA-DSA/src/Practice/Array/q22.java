package Practice.Array;
import java.lang.*;
import java.util.Arrays;
import java.util.Random;

/*

Find N Unique Integers Sum up to Zero
Input: n = 5
Output: [-7,-1,1,3,4]
Explanation: These arrays also are accepted [-5,-1,1,2,3] , [-3,-1,2,-2,4]


 */
public class q22 {
    public static void main(String[] args) {
//        int n = 3;
        int n = 9;
//        int n = 5;
        System.out.println(Arrays.toString(sumZero(n)));

    }

    static int[] sumZero(int n) {
        int[] answer = new int[n];
        int index = 0;

        if (n % 2 == 1){
            answer[index++] = 0;
        }


        n /= 2;

        for (int i = 1; i <= n; i++) {
            answer[index++] = i;
            answer[index++] = -i;
        }

        return answer;

    }
}