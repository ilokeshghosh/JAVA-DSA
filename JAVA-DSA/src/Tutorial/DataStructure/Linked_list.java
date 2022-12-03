package Tutorial.DataStructure;
import java.util.LinkedList;

public class Linked_list {
    public static void main(String[] args){
//        Types of linked list
//        1.Singly Linked List(data,next_node address)
//        2.Doubly Linked List(prev_node address, data, next_node address)
//        3.Circular Linked List(tail_node connect with head_node)
//        4.Doubly Circular Linked List(Doubly + Circular Linked List)


        LinkedList<String> ll = new LinkedList<>();
        ll.add("hi");
        ll.add("Lokesh");
        ll.add("Ghosh");

        System.out.println("The Linked List is : "+ll);

    }


    }
