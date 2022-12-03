package Practice.Functions;
import java.util.Scanner;

//Write a program to print the factorial of a
//number by defining a method named 'Factorial'.
//Factorial of any number n is represented
//by n! and is equal to 1 * 2 * 3 * .... * (n-1) *n.
public class q9 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the number :");
        int num=in.nextInt();

        System.out.println("The factorial is "+Factorial(num));
    }
    static int Factorial(int n){

        if(n==1 || n==0){
            return 1;
        }
        return n*Factorial(n-1);
    }
}
