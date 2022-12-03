//Take 2 numbers as input and print the largest number.
package Practice.FirstJava;
import java.util.Scanner;

public class q5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int num1,num2;
        System.out.println("Enter the 1st number :");
        num1=input.nextInt();
        System.out.println("Enter the 2nd number :");
        num2=input.nextInt();

        if(num1>=num2){
            System.out.println(num1+" is greater than "+num2);
        }
        else{
            System.out.println(num2+" is greater than "+num2);
        }


    }
}
