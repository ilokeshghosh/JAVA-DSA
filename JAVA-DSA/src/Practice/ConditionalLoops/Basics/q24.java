package Practice.ConditionalLoops.Basics;
import java.util.Scanner;

//Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)
public class q24 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int count=0;


        int sum=0;
        while(true){
            System.out.print("Enter the "+(count+1)+" number  : ");
            int n=in.nextInt();
            sum=sum+n;
            count++;
            if(n==0){
                break;
            }

        }
        System.out.println("The summation of total "+(count-1)+" numbers is "+sum);
    }
}
