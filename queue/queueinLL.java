class queueinLL {

    // Node class
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Queue class
    static class Queue {
        Node front = null;
        Node rear = null;

        // Check if queue is empty
        public boolean isEmpty() {
            return front == null;
        }


        // Add element at the rear
        public void enqueue(int data) {

            Node newNode = new Node(data);

            // If queue is empty
            if (front == null) {
                front = newNode;
                rear = newNode;
            } else {
                rear.next = newNode;
                rear = newNode;
            }
        }

        // Remove element from the front
        public int dequeue() {

            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }

            int data = front.data;
            front = front.next;

            // If last element was removed
            if (front == null) {
                rear = null;
            }

            return data;
        }

        // View the front element
        public int peek() {

            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }

            return front.data;
        }
    }

    public static void main(String[] args) {

        Queue q = new Queue();

        // enqueue
        q.enqueue(10);
        q.enqueue(20);

        // dequeue
        System.out.println(q.dequeue()); // 10

        q.enqueue(30);
        q.enqueue(40);

        // peek and dequeue all elements
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.dequeue();
        }
    }
}