package Practice.FirstJava;
import java.util.HexFormat;
import java.util.Scanner;

//Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
public class q4 {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        float num1,num2;
//        Scanner input2=new Scanner(System.in);
        String op;
        System.out.print("Enter the 1st number : ");
        num1=input.nextFloat();
        System.out.print("Enter the 2nd number : ");
        num2=input.nextFloat();
        System.out.print("Enter the operator(like - +,-,*,/) you want operation of :");
        op=input.next();

        if(op.equals("+")){
            System.out.println("The addition of the number is :" + (num1+num2));
        }
        else if (op.equals("-")) {
            System.out.println("The subtraction of the number is : " + (num1-num2));
        }
        else if (op.equals("*")){
            System.out.println("The multiplication of the number is : "+(num1*num2));
        }
        else if(op.equals("/"))
        {
            System.out.println("The division of the number is : "+(num1/num2));
        }
        else {
            System.out.println("Plz enter valid number or operator :");
        }



    }
}


