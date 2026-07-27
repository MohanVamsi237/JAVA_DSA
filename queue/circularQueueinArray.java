public class circularQueueinArray {
    static class Queue {

        int arr[];
        int size;
        int rear = -1;
        int front = -1;

        Queue(int n) {
            arr = new int[n];
            size = n;
        }

        // Check if queue is empty
        public boolean isEmpty() {
            return rear == -1 && front == -1;
        }

        // Check if queue is full
        public boolean isFull() {
            return (rear + 1) % size == front;
        }

        // Add element to queue
        public void add(int data) {

            if (isFull()) {
                System.out.println("Queue is Full");
                return;
            }

            // First element
            if (front == -1) {
                front = 0;
            }

            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        // Remove element from queue
        public int remove() {

            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }

            int result = arr[front];

            // Only one element present
            if (rear == front) {
                rear = -1;
                front = -1;
            }
            else {
                front = (front + 1) % size;
            }

            return result;
        }

        // Get front element
        public int peek() {

            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }

            return arr[front];
        }
    }


    public static void main(String args[]) {

        Queue q = new Queue(5);

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        System.out.println("Removed: " + q.remove());

        q.add(6);

        System.out.println("Removed: " + q.remove());

        q.add(7);


        System.out.println("Queue elements:");

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}


