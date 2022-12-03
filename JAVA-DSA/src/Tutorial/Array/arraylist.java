package Tutorial.Array;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
public class arraylist {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        //Syntax
//        ArrayList<Integer> list=new ArrayList<>();

        {

            ArrayList<Integer> list = new ArrayList(5);

//        list.add(42);
//        list.add(4);
//        list.add(45);
//        list.add(7);
//        list.add(740);
//        list.add(74);
//
//        System.out.println(list.contains(0));//checking list with value returns boolean value
//        System.out.println(list);
//        list.set(0,99);//(index,value); //updating value
//        list.remove(2);//removing/updating value
//        System.out.println(list);


            //taking user input;
//            for (int i = 0; i < 5; i++) {
//                list.add(in.nextInt());
//
//            }
//
//            //get item at any index
//            for (int i = 0; i < 5; i++) {
//                System.out.println(list.get(i));//pass index here , list[index] will not work here
//            }
//        System.out.println(list);
        }


        //Multidimensional ArrayList

        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        //Initialisation
        for(int i=0;i<3;i++){
            list.add(new ArrayList<>());

        }

        //add elements
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                list.get(i).add(in.nextInt()); //get the arraylist at index i and add to the array list
            }
        }

        System.out.println(list);
    }
}
