package Tutorial.DataStructure;
import  java.util.*;
public class Queue_demo {
    public static void main(String[] args){
        //It is a linear collection of items are inserted and removed in a particular order
        //It follows FIFO(First In First Out) principal

//        Queue q1=new Queue();

       Queue<Integer> q1=new LinkedList<>();

       //Adding elements{0, 1, 2, 3, 4}to the queue
        for(int i=0;i<5;i++){
            q1.add(i);

        }
        System.out.println("Elements of queue : "+q1);
        System.out.println(q1.isEmpty());
        q1.add(5);
        System.out.println("Elements of queue : "+q1);
        System.out.println(q1.peek());
        System.out.println("Elements of queue : "+q1);
        q1.remove();
        System.out.println("Elements of queue : "+q1);
        System.out.println(q1.size());








    }
}
