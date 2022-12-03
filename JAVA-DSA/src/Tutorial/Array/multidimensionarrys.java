package Tutorial.Array;
import java.util.Arrays;
import java.util.Scanner;

public class multidimensionarrys {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
//        int[][] arr=new int[3][3];

//        int[][] arr= {
//
//                {1,2,3}, //0th index
//                {4,5}, //1st index
//                {7,8,9,10}//2nd index -> arr[2]={7,8,9,10}
//        };

        //input
        int[][] arr= new int[3][3];

        System.out.println(arr.length);//no of rows

        for (int row=0;row<arr.length;row++){
            //for each col in every row
            for(int col=0;col<arr[row].length;col++){
                arr[row][col]=in.nextInt();
            }
        }
//        for (int row=0;row<arr.length;row++){
//            for(int col=0;col<arr[row].length;col++){
//                System.out.print(arr[row][col]+" ");
//
//            }
//            System.out.println("");
//        }


        //output using tostring function
//        for(int row=0;row<arr.length;row++){
//            System.out.println(Arrays.toString(arr[row]));
//        }

        //output using enhanced for loop;
        for(int[] row:arr){//datatype of every  single element itself is an array
            System.out.println(Arrays.toString(row));

        }


    }
}
