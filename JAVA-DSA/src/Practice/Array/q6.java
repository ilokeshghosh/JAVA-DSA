package Practice.Array;
import java.util.Arrays;
import java.util.Scanner;

public class q6 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter number of extra-candies ");
        int extra=in.nextInt();
        int[] candies={12,1,12};
        int n=candies.length;
        boolean[] result=new boolean[n];
        int max=candies[0];

        int[] temp= {12,1,12};
        int maxindex=0;
        for (int i=0;i<n;i++){
            candies[i]+=extra;
            for ( int j=0;j<n;j++){
                if (temp[j]<=candies[i]){

                    maxindex=i;
                    result[i]=true;

                }
                else{
                    result[i]=false;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(result));


    }
}
