package Tutorial.DataStructure;
import java.util.*;
import java.io.*;

public class Stack_demo {
    public static void main(String[] args){
        //It is linear collection of items , that are inserted and removed in a particular order
        //It follows LIFO(Last In First Out) principal while removal
      Stack stack1= new Stack();
      Stack<Integer> stack2= new Stack<Integer>();

      stack1.push(4);
      stack1.push("hey");
      stack1.push("Lokesh");

      stack2.push(5);
      stack2.push(2);
      stack2.push(6);
      System.out.println(stack1);
      System.out.println(stack2);
      System.out.println(stack2.peek());
      System.out.println(stack2.pop());
      System.out.println(stack2);
      System.out.println(stack2.size());





    }
}
