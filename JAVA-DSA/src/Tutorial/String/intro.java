package Tutorial.String;
import java.util.Scanner;
import java.util.StringTokenizer;

public class intro {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String nm=new String("Lokesh Ghosh");
//        String str1=in.nextLine();


//        Creating String as String literal

//      String str="Hello world";//Uses String constant pool;
//        System.out.println(str);



        // creating String using by new function

//        String str1= new String("Hello"); //uses normal heap memory;
//        String internedString = str1.intern();//interning it to constant pool;
//        System.out.println(str1);

        //Creating String using String Buffers --> StringBuffer represents growable and writable Character sequence ;
//        StringBuffer s=new StringBuffer("Geeks");
//        System.out.println(s);

        //Creating String using String Builder --> It creates a mutable sequence of Characters ;
//        StringBuilder str= new StringBuilder("I am ");
//       StringBuilder add= str.append(nm);//appends works in last ;
//        System.out.println(add);

        StringTokenizer str=new StringTokenizer(nm);

        System.out.println(str);

  }
}