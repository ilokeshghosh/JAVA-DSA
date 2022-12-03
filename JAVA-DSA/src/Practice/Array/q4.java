package Practice.Array;
import java.util.Arrays;
import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] accounts = new int[3][3];

        for (int row = 0; row < accounts.length; row++) {
            for (int col = 0; col < accounts[row].length; col++) {
                accounts[row][col] = in.nextInt();
            }
        }
        for (int row = 0; row < accounts.length; row++) {
            for (int col = 0; col < accounts[row].length; col++) {
                System.out.print(accounts[row][col] + " ");
            }
            System.out.println();
        }


        int[] sums = new int[accounts.length];
        int id = 0;
        sums[0] = 0;
        for (int row = 0; row < accounts.length; row++) {
            for (int col = 0; col < accounts[row].length; col++) {
                sums[id] = sums[id] + accounts[row][col];
            }
            id++;

        }
        int maxsum = sums[0];
        System.out.println(Arrays.toString(sums));
//        System.out.println(sum[0]);
        for (int i = 1; i < accounts.length; i++) {
            if (sums[i] > maxsum) {
                maxsum = sums[i];

            }
//            else if(sums[i]<maxsum){
//                maxsum = sums[i - 1];
//            }


        }
        System.out.println(maxsum);
    }
}
