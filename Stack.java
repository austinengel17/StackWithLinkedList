import java.util.Iterator;

public class Stack<E>{
    //if exceeds length of array, make new array and transfer all elements.
    Node top;

    public void add(E data){
        Node<E> node = new Node<>(data);

        node.next = top;
        top = node;
    }
    public E pop(){
        if(isEmpty())return null;

        E storage = (E) top.data;
        top = top.next;
        return storage;
    }
    public E peak(){
        return (E) top.data;
    }
    public boolean isEmpty(){
        return (top == null);
    }

    public void print(){
        if(isEmpty()) return;

        Node node = top;
        while(node.next != null){
            System.out.print(node.data + " ");
            node = node.next;
        }
        System.out.print(node.data + "   |    ");
    }
    private class Node<E>{
        E data;
        Node next;

        public Node(E data){
            this.data = data;
        }
    }

}
