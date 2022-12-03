package Tutorial.String;
import java.util.Scanner;
public class method {
    public static void main(String[] args) {
//        Scanner in =new Scanner(System.in);
//        String str= in.nextLine();
//        String inter= str.intern();//storing object in java constant pool;
//        System.out.println(inter);

        String str="Lokesh Ghosh";

        //Length of a String ;
        int len=str.length();
        System.out.println(len);

        //Fetching character by index
        char ch= str.charAt(3);
        System.out.println(ch);


        //Returning substring from i-th index to end;
        String sub= str.substring(3);
        System.out.println(sub);

        //Returning substring from i-th to (j-1) index;
        sub=str.substring(3,8);
        System.out.println(sub);

        //Concatenates specified String to the end of this String ;
        String str1="I am ";
        String output=str1.concat(str);
        System.out.println(output);

        //Index of string
        int ind=str.indexOf("Ghosh");//it only tells index of 1st occurring char of given string ;
        System.out.println(ind);

        //Index of specified string
        ind = str.indexOf("o",3); //it only give the index of 1st occurring char after the given index ;
        System.out.println(ind);


        //Lastindex of specified string
        ind =str.lastIndexOf("h");
        System.out.println(ind);


        //Comparing strings and returning boolean value
        boolean bol= "lokesh".equals("Lokesh");
        System.out.println(bol);
        bol="Lokesh".equals("Lokesh");
        System.out.println(bol);


        //Comparing string and ignoring case
        bol="lokesh".equalsIgnoreCase("Lokesh");
        System.out.println(bol);

        //compares two string lexicographically
        int com=str.compareTo("Lokesh Ghosh");
        System.out.println(com);

        //converting to lowercase
        str= "LOKESH GHOSH";
        System.out.println(str.toLowerCase());

        //converting to uppercase
        str="lokesh ghosh";
        System.out.println(str.toUpperCase());


        //Removing whitespaces at both ends
        str= "  lokesh     ";
        System.out.print(str.trim());
        System.out.println("ghosh");


        //replace

        str= "aokesh";

        String nstr=str.replace('a','L');
        System.out.println(nstr);







    }

}
