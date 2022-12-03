package Practice.FirstJava;
import java.util.Scanner;

//To calculate Fibonacci Series up to n numbers.
public class q7 {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.println("Enter the number upto which you want fibonacci series of :");
        int n=input.nextInt();
        int num1=0;
        int num2=1;
        int num3=0;

        System.out.print(num1+" "+num2+" ");

        while(num3<n){

            num3=num1+num2;
            System.out.print(num3+" ");
            num1=num2;
            num2=num3;




        }

    }
}
