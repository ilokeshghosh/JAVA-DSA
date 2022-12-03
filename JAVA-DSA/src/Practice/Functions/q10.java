package Practice.Functions;
import java.util.Scanner;
//Write a function to find if a number is a palindrome
//or not.Take number as parameter.
public class q10 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number : ");
        int num=in.nextInt();
        if(palin(num)){
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not Palindrome");
        }


    }
    static boolean palin(int n){
        int org=n;
        int rev=0;

        while(n!=0){
            int r=n%10;
            rev=rev*10+r;
            n/=10;
        }
        if (rev==org){
            return true;
        }

            return false;

    }
}
