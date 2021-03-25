package com.decagon;
import static java.lang.System.out;

public class Main {

    public static void main(String[] args) {

        LinkedList list6 = new LinkedList();

        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(4);
        list6.insertAt(0,node1);

        list6.deleteAt(0);
        list6.insertAt(0,node1);
       System.out.println(list6.listSize());
        list6.insertAt(1,node2);
        list6.insertAt(2,node3);
        list6.insertAt(3,node4);
        list6.insertAt(3,node5);
        System.out.println(list6.listSize());

        System.out.println(list6.getElementAt(1).data);





    }


}
