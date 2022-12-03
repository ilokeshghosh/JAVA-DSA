package Practice.ConditionalLoops.Intermidiate;
import java.util.Scanner;

//Power In Java
//and
// Calculating the Power of a Number in Java Without Using Math pow() Method
public class q7 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the base :");
        int b=in.nextInt();
        System.out.println("Enter the power :");
        int p=in.nextInt();
        int val = 1;
        int i=1;
        while(i<=p){
            val=val*b;
            i++;
        }
        System.out.println(val);

        //Using Math class
        System.out.println(Math.pow(2,4));


    }
}
