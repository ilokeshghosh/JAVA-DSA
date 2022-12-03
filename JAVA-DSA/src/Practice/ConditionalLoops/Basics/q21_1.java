package Practice.ConditionalLoops.Basics;
import java.util.Scanner;

//Fibonacci number of n-th term In Java Programs
public class q21_1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number upto which you want fibonacci series :");
        int t=in.nextInt();
        int n1=0;
        int n2=1;
        int s=0;
        for (int i=2;i<=t;i++){
            s=n1+n2;
            n1=n2;
            n2=s;


        }
        System.out.println(s);


    }
}
