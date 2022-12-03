package Practice.Array;
//Concatenation of Array
import java.util.Scanner;
public class q2 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int[] arr1 = new int[5];
        int[] arr2=new int[5];
        for (int i=0;i<arr1.length;i++){
            System.out.println("Enter the number of "+i+"index of array 1");
            arr1[i]=in.nextInt();
        }
        for (int i=0;i<arr2.length;i++){
            System.out.println("Enter the number of "+i+"index of array 2 ");
            arr2[i]=in.nextInt();
        }
        int[] result=new int[arr1.length+arr2.length];
        int count=1;
        for (int i=0;i<count;i++){
                for (int j=0;j<5;j++) {

                    if (count==1) {
                        result[j] = arr1[j];
                    } else if (count == 2) {
                        result[j+5]=arr2[j];
                    }
                    else {
                        break;
                    }
                }
                count++;
        }

        for (int i=0;i<result.length;i++){
            System.out.println(result[i]);
        }
    }
}
