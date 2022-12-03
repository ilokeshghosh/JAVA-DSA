package Tutorial.DataStructure;
import java.util.*;
public class Hash_table {
    public static void main(String[] args){
        Hashtable<Integer, String> ht1=new Hashtable<>();

        ht1.put(1, "one");
        ht1.put(2, "Two");
        ht1.put(3, "Three");
        ht1.put(4, "Four");
        System.out.println("Mapping of Hash Table is : "+ht1);
        ht1.remove(2);
        System.out.println("Mapping of Hash Table is : "+ht1);
        System.out.println("Size of the Hash Table is : "+ht1.size());
        ht1.clear();
        System.out.println("clear() is used to clear all the data : "+ ht1);


    }
}

