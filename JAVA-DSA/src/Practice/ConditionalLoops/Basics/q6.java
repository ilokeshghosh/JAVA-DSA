//Area Of Rhombus
package Practice.ConditionalLoops.Basics;
import java.util.Scanner;
public class q6 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the length of the diagonal-1 : ");
        float d1= in.nextFloat();
        System.out.print("Enter the length of the diagonal-2 : ");
        float d2=in.nextFloat();
        float a=0.5f*(d1*d2);
        System.out.println("The area of rhombus is : "+a);
    }
}
