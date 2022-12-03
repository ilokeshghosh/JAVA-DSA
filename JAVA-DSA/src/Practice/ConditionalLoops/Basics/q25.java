package Practice.ConditionalLoops.Basics;
import java.util.Scanner;

//Take integer inputs till the user enters 0 and print the largest number from all.
public class q25 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n;
        int max=0;
        while(true){
            System.out.print("Enter the number : ");
            n=in.nextInt();
            if(n>max){
                max=n;
            }
            if(n==0){
                break;
            }

        }
        System.out.println("The largest number between all number you entered is "+max);
    }
}
