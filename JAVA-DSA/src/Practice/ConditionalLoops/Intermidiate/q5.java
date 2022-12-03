package Practice.ConditionalLoops.Intermidiate;
import java.util.Scanner;

//Calculate Distance Between Two Points
/*
Reference : pythagoras ac^2=ab^2+bc^2;
so, when we consider a 2-d graph we get : ac^2=(x2-x1)^2+(y2-y1)^2;

 */
public class q5 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the initial point (x1,y1) : ");
        float x1=in.nextFloat();
        float y1=in.nextFloat();
        System.out.print("Enter the initial point (x2,y2) : ");
        float x2=in.nextFloat();
        float y2=in.nextFloat();

        float c1=(float)(Math.pow((x2-x1),2));
        float c2=(float)(Math.pow((y2-y1),2));
        float dis=(float)(Math.sqrt(c1+c2));
        System.out.println("The distance is :"+dis);
    }

}
