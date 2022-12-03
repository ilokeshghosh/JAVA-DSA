//1.Write a program to print whether a number is even or odd, also take input from the user.
package Practice.FirstJava;
import java.util.Scanner;

public class q1 {
    public static void main(String[] args)
    {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = input.nextInt();
        if(num%2==0){
            System.out.println("The given number :"+num+" is even ");

        }
        else{
            System.out.println("The given nubmer : " + num+" is odd");



        }

    }
}
