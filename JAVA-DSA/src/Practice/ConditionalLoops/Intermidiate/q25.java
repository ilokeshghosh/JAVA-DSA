package Practice.ConditionalLoops.Intermidiate;
import java.util.Scanner;

//Kunal is allowed to go out with his friends only on the even
// days of a given month. Write a program to count the number of
// days he can go out in the month of August.

public class q25 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int count=0;
        for (int i=2;i<=31;i++){
            if(i%2==0){

                count++;
//                System.out.println(i);

            }
        }
        System.out.println("Kunal can go for "+count+" days in the month of August ");

    }
}
