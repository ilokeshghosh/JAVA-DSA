package Practice.Functions;
import java.util.Scanner;

//Define a program to find out whether a given number
//is even or odd
public class q2 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num=in.nextInt();

        if(check(num)){
            System.out.println("The given number is even");
        }
        else {
            System.out.println("The given number is odd");

        }
    }
    static boolean check(int a){
        return a % 2 == 0; //this is simplified if
    }
}
