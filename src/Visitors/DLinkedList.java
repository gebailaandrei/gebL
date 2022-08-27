package Visitors;

import java.util.List;

public class DLinkedList {
    public Node head, tail;
    int size = 0;

    public DLinkedList() {}

    public void addTail(int value)
    {
        size++;
        Node node = new Node(value);
        if(head == null ) {
            head = tail = node;
            head.left = tail.right = null;
        }
        else
        {
            tail.right = node;
            node.left = tail;
            tail = node;
            tail.right = null;
        }
    }

    public void addHead(int value)
    {
        size++;
        Node node = new Node(value);
        if(head == null) {
            head = tail = node;
            head.left = tail.right = null;
        }
        else
        {
            head.left = node;
            node.right = head;
            head = node;
            head.left = null;
        }
    }
    // TODO FIX THIS
    public void addPos(int index, int value)
    {
        size++;
        Node node = new Node(value);
        if(head == null) {
            head = tail = node;
            head.left = tail.right = null;
        }
        else
        {
            node = head;
            int i = 0;
            while (node != null) {
                if (i == index) {
                    if(i == 0)
                    {
                        Node newNode = new Node(value);
                        newNode.left = null;
                        newNode.right = node;

                        node.left = newNode;
                        head = newNode;
                    }
                    else if(i == size - 1)
                    {
                        Node newNode = new Node(value);
                        newNode.left = node;
                        newNode.right = null;

                        node.right = newNode;
                        tail = newNode;
                    }
                    else
                    {
                        Node newNode = new Node(value);
                        newNode.left = node.left;
                        node.left.right = newNode;
                        newNode.right = node;
                        node.left = newNode;
                    }

                    return;
                }
                node = node.right;
                i++;
            }
        }
        throw new Error("Index out of bounds.");
    }

    public void replace(int index, int value)
    {
        Node node = head;
        if(head == null) {
            throw new Error("List is empty.");
        }
        int i = 0;
        while(node != null) {
            if(i == index)
            {
                node.value = value;
                return;
            }
            node = node.right;
            i++;
        }
        throw new Error("Index out of bounds.");
    }

    public int getElement(int index)
    {
        Node node = head;
        if(head == null) {
            throw new Error("List is empty.");
        }
        int i = 0;
        while(node != null) {
            if(i == index)
                return node.value;
            node = node.right;
            i++;
        }
        throw new Error("Index out of bounds.");
    }

    public static void main(String[] args) {
        DLinkedList list = new DLinkedList();
        list.addTail(1);
        list.addTail(2);
        list.addTail(3);
        list.addTail(4);
        list.addTail(5);
        list.addPos(list.size-1, 10);
        System.out.println(list.getElement(list.size)-1);
    } // 0 1 2 10 3 4 5

}

class Node{
    int value;
    Node left;
    Node right;

    public Node(int value) {
        this.value = value;
    }
}
