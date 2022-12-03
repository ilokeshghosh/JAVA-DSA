package Tutorial.SwitchCase;
import java.util.Scanner;
public class fruitfun {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the name of the fruit : ");
        String fruit = in.next();

        switch (fruit) { //directly jumped to the desired case
            case "Mango" -> System.out.println("King of fruits");
            case "Apple" -> System.out.println("A Sweet red fruit ");
            case "Orange" -> System.out.println("Round sour fruit ");
            case "Grapes" -> System.out.println("Small fruit ");
            default -> System.out.println("plz enter a valid fruit name ");
        }
    }
}
