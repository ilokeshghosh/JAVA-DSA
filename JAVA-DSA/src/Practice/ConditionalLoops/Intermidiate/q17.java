package Practice.ConditionalLoops.Intermidiate;
import java.util.Scanner;

public class q17 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number :");
        int num=in.nextInt();

        int rev=0;
        int org=num;
        while(num!=0){
            int r=num%10;
            rev=rev*10+r;

            num/=10;
        }

        if(rev==org){
            System.out.println("The number is palindrome ");

        }
        else{
            System.out.println("The number is not palindrome ");
        }
    }
}
