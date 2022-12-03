package Tutorial.Functions;
import java.util.Scanner;

public class greet {
    public static void main(String[] args) {
//    greet();
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the name :");
        String name=in.next();
    String per=greet2(name);
        System.out.println(per);
    }

    private static String greet2(String name) {
        String message ="Hello "+name;
        return message;
    }

    static void greet(){
        System.out.println("Hello World !");
    }
}
