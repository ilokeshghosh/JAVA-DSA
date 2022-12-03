package Tutorial.StringBuffer;

public class StringBuffer_Methods {
    public static void main(String[] args){

        StringBuffer str= new StringBuffer("Lokesh");

        //Append
        str.append(" Ghosh");
        System.out.println(str);

        //Insert
        str.insert(1,"Java");
        System.out.println(str);

        //Replace
        str.replace(1,5,"Hello");
        System.out.println(str);

        //Delete
        str.delete(1,6);
        System.out.println(str);

        //Reverse
        str.reverse();
        System.out.println(str);

        //Capacity
        System.out.println( str.capacity());
    }
}
