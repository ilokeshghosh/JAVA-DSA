package Practice.ConditionalLoops.Intermidiate;
import java.util.Scanner;

//Calculate CGPA Java Program
public class q10 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the number of subject :");
        int n=in.nextInt();
        float sum=0;
        int count=1;
        System.out.println("Enter the Subject Grades :");
        for (int i=0;i<n;i++){

            float m=in.nextFloat();
            sum+=m;
        }
        float cgpa=sum/n;
        System.out.println("Your cgpa is : "+cgpa);

    }
}
