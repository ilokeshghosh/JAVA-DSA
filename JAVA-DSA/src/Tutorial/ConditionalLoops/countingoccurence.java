//Find the re-occurence of a number
package Tutorial.ConditionalLoops;
import java.util.Scanner;

public class countingoccurence {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number  of : ");
        int x=in.nextInt();
        System.out.println("Enter the number you want to find : ");
        int f=in.nextInt();


        int org=x;
        int r;
        int count =0;


        while(x!=0){
            r=x%10;
            if(r==f){
                count++;
            }
            x=x/10;
        }
        System.out.println(f+" re-occures in "+org+" for "+count+"-times ");
    }
}
