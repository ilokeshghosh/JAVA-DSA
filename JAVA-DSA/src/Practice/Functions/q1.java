//Define two methonds to print th maximum and the minimum number respectively
//among three numbers entered by the user;
package Practice.Functions;
import java.util.Scanner;
public class q1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the three numbers : ");
        int x=in.nextInt();
        int y=in.nextInt();
        int z=in.nextInt();
        System.out.println(max(x,y,z)+" is the greatest");

    }
    static int max(int a,int b,int c){
        int max=a;
        if(b>a && b>c){
            max=b;
        }
        else if(c>a && c>b){
            max=c;
        }
        return max;


    }
}

