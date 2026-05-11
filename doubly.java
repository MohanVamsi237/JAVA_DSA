package linkedlist;

public class doubly {

    Node head;
    private int size;

    doubly() {
        this.size = 0;
    }

    class Node {
        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
            size++;
        }
    }

    public void addFirst(int data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;
    }

    public void addLast(int data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node currNode = head;

        while (currNode.next != null) {
            currNode = currNode.next;
        }

        currNode.next = newNode;
        newNode.prev = currNode;
    }

    public void deleteFirst() {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        size--;

        if (head.next == null) {
            head = null;
            return;
        }

        head = head.next;
        head.prev = null;
    }

    public void deleteLast() {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        size--;

        if (head.next == null) {
            head = null;
            return;
        }

        Node lastNode = head;

        while (lastNode.next != null) {
            lastNode = lastNode.next;
        }

        lastNode.prev.next = null;
    }

    public int getsize() {
        return size;
    }

    public void printList() {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node currNode = head;

        while (currNode != null) {
            System.out.print(currNode.data + " <-> ");
            currNode = currNode.next;
        }

        System.out.println("NULL");
    }

    public void reverseList() {

        if (head == null || head.next == null) {
            return;
        }

        Node curr = head;
        Node temp = null;

        while (curr != null) {

            temp = curr.prev;
            curr.prev = curr.next;
            curr.next = temp;

            curr = curr.prev;
        }

        if (temp != null) {
            head = temp.prev;
        }
    }

    public static void main(String[] args) {

        doubly list = new doubly();

        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);

        System.out.println("Original List:");
        list.printList();

        list.reverseList();

        System.out.println("Reversed List:");
        list.printList();
    }
}