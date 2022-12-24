package Tutorial.ConditionalLoops;
import java.util.Scanner;


public class casecheck {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the Character : ");
        char l =in.next().trim().charAt(0);

        if(l>='a' && l<='z'){
            System.out.println("Lowercase");
        }
        else{
            System.out.println("Uppercase");
        }

    }
}
