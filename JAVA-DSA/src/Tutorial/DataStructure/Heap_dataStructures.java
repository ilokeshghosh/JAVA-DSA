package Tutorial.DataStructure;
public class Heap_dataStructures {
    public static void main(String[] args){
    /*Two properties of Heap
    1.complete binary tree
    2.One of two types(1.Min Heap , 2. Max Heap)

    **min heap**
    value(parent)<=value(child)

    **Max Heap**
    value(parent)>=value(child)

        Operation in heap

        1.Insert
        Top to bottom,left to right
        with each insertion compare node with parent and bubble
        for min heap(insert+ keep swapping if node is less than parent node)
        for max heap(insert+ keep swapping if node is greater than parent node)
        complexity is 0(log n)

        2.Delete
        min heap - delete the smallest value
        mix heap - delete the largest value

        # how to delete item from min heap:
        delete the root node
        move the last node to root
        compare and bubble down if needed

        # how to delete item form max heap:
        delete the root node
        move the last node to root
        compare and bubble down if needed

    */




    }

}
