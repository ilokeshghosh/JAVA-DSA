//A person is eligible to vote if his/her age
//is greater than or equal to 18.Define a method
//to find out if he/she is eligible to vote
package Practice.Functions;
import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter your age :");
        int age= in.nextInt();

        if(check(age)){
            System.out.println("Yes can vote");
        }
        else{
            System.out.println("Sorry you can't vote ");
        }


    }
    static boolean check(int a){
        return a>=18;
    }
}
