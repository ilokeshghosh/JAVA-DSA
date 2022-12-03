//To find Armstrong Number between two given number.
package Practice.FirstJava;
import java.util.Scanner;
public class q9 {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        System.out.print("Enter the number to check whether the number is Amstrong's number  or not : ");
        int i= input.nextInt();
        int org=i;
        int c=0;
        int r;
        while(i!=0){
            r=i%10;
            c=c+(r*r*r);
            i=i/10;
        }
        if(c==org){
            System.out.println(org+" is a Amstrong's number ");

        }
        else{
            System.out.println(org+" is not a Amstrong's number ");
        }
    }
}
