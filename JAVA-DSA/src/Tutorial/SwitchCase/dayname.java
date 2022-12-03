package Tutorial.SwitchCase;
import java.util.Scanner;
public class dayname {
    public static void main(String[] args){
        Scanner in= new Scanner(System.in);
        int day=in.nextInt();

        //Enhanced Switch case
        switch(day){
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");

        }

/*
        //doing by weekday or weekend wise by enhanced switch case
        switch(day){
            case 1,2,3,4,5 -> System.out.println("Weekdays");
            case 6,7 -> System.out.println("Weekend");

        }

 */

        //doing by weekday or weekend wise by not-enhanced switch case
        switch(day){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekdays");
                break;
            case 6:
            case 7:
                System.out.println("Weekends");
        }

    }
}
