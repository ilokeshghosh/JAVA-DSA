//Write a program to print the sum of two numbers entered by user by
//your own method.
package Practice.Functions;
import java.util.Scanner;
public class q4 {
    static Scanner in=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("The summation of the integer is "+sum());


    }
    static int sum(){
        System.out.println("Enter  two numbers ");
        int num1=in.nextInt();
        int num2=in.nextInt();
        return num1+num2;
    }
}
