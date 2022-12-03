package Practice.ConditionalLoops.Intermidiate;
import java.util.Scanner;

public class q13 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("How many number  :");
        int n=in.nextInt();
        float sum=0;
        for (int i=1;i<=n;i++){


            sum+=i;
        }
        System.out.println(sum+" Is the summation of "+n+" numbers");
    }
}
