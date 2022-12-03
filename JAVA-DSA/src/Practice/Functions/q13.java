package Practice.Functions;
import java.util.Scanner;

public class q13 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the start number :");
        int snum=in.nextInt();
        System.out.println("Enter the end number :");
        int ednum=in.nextInt();


    prime(snum,ednum);

    }

    static void prime(int start,int end){
        for(int i=start;i<end;i++){
            if(i<=1){
                System.out.println(i+"Not Prime");
            }
            for(int j=2 ;j<i;j++){
                if(i%j==0){
//                    System.out.println(i+"Not Prime");
                    break;
                }
                else if(j==i-1){
                    System.out.println(i+" prime");
                }
                }
            }
        }

    }



