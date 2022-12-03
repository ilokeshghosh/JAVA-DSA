package Tutorial.Array;
import java.util.Scanner;
public class Intro {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int[] a;
        a=new int[20];//Instantiating of an array
        //or
        int[] b= new int[30];
        {
            //Array Literal
            int[] arr = {2, 53, 5};
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }
        }

        {
            //returning array from a method

            int[] arr= re();
            for (int i=0;i<arr.length;i++){
                System.out.println(arr[i]);
            }
        }

        {
            //class of object of arrays
            int[] intArray={4,1,3};
            String[] strArray = {"Lokesh","Ghosh"};
            System.out.println(intArray.getClass());
            System.out.println(intArray.getClass().getSuperclass());
            System.out.println(strArray.getClass());

        }







    }
    static int[] re(){
        return new int[]{3,4,2};
    }
}
