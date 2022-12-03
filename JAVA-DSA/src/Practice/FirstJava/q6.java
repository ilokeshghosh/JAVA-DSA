package Practice.FirstJava;
import java.util.Scanner;

//Input currency in rupees and output in USD.
public class q6 {
    public static void main(String[] args) {
        System.out.print("Enter the currency is usd : $");
        Scanner input=new Scanner(System.in);
        int num = input.nextInt();
        int inr =(int)(num*78.18);
        System.out.println("$"+num+" in rupees is "+ inr);
    }
}
