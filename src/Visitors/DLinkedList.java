package Visitors;

public class DLinkedList {
    class Node{
        int value;
        Node left, right;

        public Node(int value) {
            this.value = value;
        }
    }

    public Node head, tail;
    public int size = 0;

    public DLinkedList() {}
    /** Add element at the tail of the list */
    public void addTail(int value) {
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
    /** Add element at the head of the list */
    public void addHead(int value) {
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
    /** Add element at the specified position.
     *  Indexing starts at position 0. */
    public void add(int index, int value) {
        Node node = new Node(value);
        if(head == null) {
            head = tail = node;
            head.left = tail.right = null;
            size++;
            return;
        }
        else
        {
            if(index == 0) {
                addHead(value);
                return;
            }
            else if(index == size){
                addTail(value);
                return;
            }
            node = head.right;

            int i = 1;
            if(index > size/2)
            {
                i = size-1;
                node = tail;
            }

            do {
                if (i == index) {
                    Node newNode = new Node(value);
                    newNode.left = node.left;
                    node.left.right = newNode;
                    newNode.right = node;
                    node.left = newNode;
                    size++;
                    return;
                }

                if(index <= size/2)
                {
                    i++;
                    node = node.right;
                }
                else
                {
                    i--;
                    node = node.left;
                }
            } while (node != null);
        }
        throw new Error("Index out of bounds.");
    }
    /** Remove element at the tail of the list */
    public void removeTail() {
        tail.left.right = null;
        tail = tail.left;
        size--;
    }
    /** Remove element at the head of the list */
    public void removeHead() {
        head.right.left = null;
        head = head.right;
        size--;
    }
    /** Remove element at the specified position.
     *  Indexing starts at position 0. */
    public void remove(int index) {
        Node node;

        if(index == 0) {
            removeHead();
            return;
        }
        else if(index == size-1){
            removeTail();
            return;
        }

        node = head.right;

        int i = 1;
        if(index > size/2)
        {
            i = size-2;
            node = tail.left;
        }

        do {
            if (i == index) {
                node.left.right = node.right;
                node.right.left = node.left;
                size--;
                return;
            }

            if(index <= size/2)
            {
                i++;
                node = node.right;
            }
            else
            {
                i--;
                node = node.left;
            }
        } while (node != null);
        throw new Error("Index out of bounds.");
    }
    /** Replace element at the specified position.
     *  Indexing starts at position 0. */
    public void replace(int index, int value) {
        Node node;
        if(head == null) {
            throw new Error("List is empty.");
        }

        node = head;

        int i = 0;
        if(index > size/2)
        {
            i = size-1;
            node = tail;
        }

        while(node != null) {
            if(i == index)
            {
                node.value = value;
                return;
            }
            if(index <= size / 2)
            {
                i++;
                node = node.right;
            }
            else
            {
                i--;
                node = node.left;
            }
        }
        throw new Error("Index out of bounds.");
    }
    /** Get the element at the specified position.
     *  Indexing starts at position 0. */
    public int get(int index) {
        Node node = head;
        if(head == null) {
            throw new Error("List is empty.");
        }

        int i = 0;
        if(index > size/2)
        {
            i = size-1;
            node = tail;
        }

        while(node != null) {
            if(i == index)
                return node.value;

            if(index <= size / 2)
            {
                i++;
                node = node.right;
            }
            else
            {
                i--;
                node = node.left;
            }
        }
        throw new Error("Index out of bounds.");
    }
    /** Sorts the list in ascending order.
     *  Bubble sort is used */
    public void sortAscending() {
        Node current, index;
        int temp;

        if(head == null) {
            return;
        }
        else {
            for(current = head; current.right != null; current = current.right) {
                for(index = current.right; index != null; index = index.right) {
                    if(current.value > index.value) {
                        temp = current.value;
                        current.value = index.value;
                        index.value = temp;
                    }
                }
            }
        }
    }
    /** Sorts the list in descending order.
     *  Bubble sort is used */
    public void sortDescending() {
        Node current, index;
        int temp;

        if(tail == null) {
            return;
        }
        else {
            for(current = tail; current.left != null; current = current.left) {
                for(index = current.left; index != null; index = index.left) {
                    if(current.value > index.value) {
                        temp = current.value;
                        current.value = index.value;
                        index.value = temp;
                    }
                }
            }
        }
    }
    /** Prints the list */
    public void print() {
        Node node = head;
        if(head == null) {
            throw new Error("List is empty.");
        }
        System.out.print(this + " = {");
        while(node != null) {
            if(node.right == null)
                System.out.print(node.value + "}\n");
            else
                System.out.print(node.value + " ,");
            node = node.right;
        }
    }

    public static void main(String[] args) {
        DLinkedList list = new DLinkedList();

        int i = 3;

        list.addHead(5);
        list.addHead(1);
        list.addHead(9);
        list.addHead(11);
        list.addHead(3);
        list.addHead(7);
        list.addHead(10);

        list.print();

        list.sortDescending();

        list.print();



        //list.print();
    }
}

