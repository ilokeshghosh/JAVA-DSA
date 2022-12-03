package Practice.ConditionalLoops.Intermidiate;
import java.util.Scanner;

//Check Leap Year Or Not
public class q23 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the year :");
        int y=in.nextInt();

        if(y%4==0){

            if(y%100==0){

                if(y%400==0){
                    System.out.println("This is a leap year ");
                }
                else {
                    System.out.println("This is not a leap year");
                }
            }
            else {
                System.out.println("This is leap year ");
            }
        }
        else {
            System.out.println("This is not leap year ");

        }
    }
}
