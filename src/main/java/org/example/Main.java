package org.example;

import static org.example.Node.addNodeToHead;
import static org.example.Node.printLinkedList;

public class Main {
    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);

        n1.next = n2;
        n2.next = n3;

        printLinkedList(n1);
        // Add a node to head and print
        Node addToHead = addNodeToHead(n1, 0);
        printLinkedList(addToHead);
    }
}