package Tutorial.Array;
import java.util.Arrays;
import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the size of the array :");
        int s= in.nextInt();

        // array of primitive
//        int[] arr= new int[s];
//
//        for(int i=0;i<arr.length;i++){
//            System.out.println("Enter the number of "+i+" index of array");
//            arr[i]=in.nextInt();
//        }
//        for (int i=0;i<arr.length;i++){
//            System.out.println("The number at "+i+" index is "+arr[i]);
//        }

//        for(int num:arr){// for every element in array,print the element
//            System.out.println("The numbers are  "+num);// here num represents element of the array
//        }

//        System.out.println(Arrays.toString(arr));

        //array of objects
        String[] str=new String[s];
        for (int i=0;i<str.length;i++){
            str[i]=in.next();
        }
        System.out.println(Arrays.toString(str));

    }
}
