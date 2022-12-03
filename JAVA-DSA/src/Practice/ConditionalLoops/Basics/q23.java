package Practice.ConditionalLoops.Basics;
import java.util.Scanner;

//Input a number and print all the factors of that number (use loops).
public class q23 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number is : ");
        int n=in.nextInt();
        int i=1;

        while (i<=n){
            if(n%i==0){
                System.out.println(i);

            }
            i++;
        }

    }
}
