package Practice.ConditionalLoops.Basics;
import java.util.Scanner;

//Fibonacci Series up to n-th term In Java Programs
public class q21 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number upto which you want fibonacci series :");
        int t=in.nextInt();
        int n1=0;
        int n2=1;
        int s=0;
        System.out.println(n1);
        System.out.println(n2);
        for (int i=2;i<=t;i++){
            s=n1+n2;
            n1=n2;
            n2=s;
            System.out.println(s);

        }



    }
}
