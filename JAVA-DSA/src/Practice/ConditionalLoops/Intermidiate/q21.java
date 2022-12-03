package Practice.ConditionalLoops.Intermidiate;
import javax.sound.midi.Soundbank;
import java.util.Scanner;
//Java Program Vowel Or Consonant
public class q21 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the alphabet :");
        char  ch=in.next().charAt(0);
        switch (ch){
            case 'A' ,'a','E','e','i','I','o','O','u','U'-> System.out.println("This alphabet is Vowel");
            default -> System.out.println("The alphabet is consonant");

        }



    }
}
