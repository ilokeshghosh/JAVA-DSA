//Define a method that returns the product of
//numbers entered by user;
package Practice.Functions;
import java.util.Scanner;
public class q5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two numbers ");
        int num1=in.nextInt();
        int num2=in.nextInt();
        System.out.println("The product is : "+pro(num1,num2));

    }
    static int pro(int a,int b){
        return a*b;
    }
}
