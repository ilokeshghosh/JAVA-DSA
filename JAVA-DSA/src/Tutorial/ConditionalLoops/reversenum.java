package Tutorial.ConditionalLoops;
import java.util.Scanner;

public class reversenum {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a;
        System.out.println("Enter the number you want reverser of ");
        a=in.nextInt();
        int org=a;
        int rev=0;


        while(a>0){
            int r=a%10;
            rev=rev*10+r;
            a/=10;
        }
        System.out.println("Reverse of "+org+" is : "+rev);
    }
}
