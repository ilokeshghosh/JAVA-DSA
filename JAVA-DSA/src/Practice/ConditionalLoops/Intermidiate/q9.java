package Practice.ConditionalLoops.Intermidiate;
import java.util.Scanner;

public class q9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the run of the Player : ");
        int run= in.nextInt();
        System.out.println("Enter the number of times the player times out : ");
        int out= in.nextInt();
        int av=run/out;

        if(av<10){
            System.out.println("Poor batting skills");
        }
        else if(av>10 && av<20){
            System.out.println("Average batting skills ");

        }
        else if(av>20 && av<30){
            System.out.println("Above average batting skills");
        }
        else if(av>30 && av<40){
            System.out.println("Good batting skills ");
        }
        else if(av>40 && av<50){
            System.out.println("Very good batting skills");
        }
        else if(av>50){
            System.out.println("Extraordinary batting skills");
        }
    }
}
