//Take name as input and print a greeting message for that particular name.
package Practice.FirstJava;
import java.util.Scanner;

public class q2 {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);

        String name = input.nextLine();

        System.out.println("Hey !!"+name+" Good morning how are you  !");

    }
}
