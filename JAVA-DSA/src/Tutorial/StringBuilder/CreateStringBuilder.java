package Tutorial.StringBuilder;

public class CreateStringBuilder {
    public static void main(String[] args){
       StringBuilder str = new StringBuilder("Lokesh");
       StringBuilder str1= new StringBuilder("hello");
       System.out.println(str);

        //indexing the string
        System.out.println(str.charAt(0));


        //changing char by indexing
       str.setCharAt(0,'M');
       System.out.println(str);

       str.insert(1,'u');
        System.out.println(str);


        //Deleting char by indexing
        str.delete(1,2);
        System.out.println(str);


        //Appending
        str.append(" ");
        str.append(str1);
        System.out.println(str);

        //length
        System.out.println(str.length());


    }
}
