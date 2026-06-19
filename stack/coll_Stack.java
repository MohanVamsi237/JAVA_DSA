import java.util.Stack;
public class coll_Stack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // push()
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("After push: " + stack);

        // peek()
        System.out.println("Top element: " + stack.peek());

        // pop()
        System.out.println("Popped: " + stack.pop());
        System.out.println("After pop: " + stack);

        // isEmpty()
        System.out.println("Is stack empty? " + stack.isEmpty());

        // size()
        System.out.println("Size: " + stack.size());

        // search()
        System.out.println("Position of 10 from top: " + stack.search(10));
        System.out.println("Position of 50 from top: " + stack.search(50));

        // contains()
        System.out.println("Contains 20? " + stack.contains(20));

        // get() (inherited from Vector)
        System.out.println("Element at index 0: " + stack.get(0));

        // set() (inherited from Vector)
        stack.set(0, 100);
        System.out.println("After set: " + stack);

        // remove(Object)
        stack.remove(Integer.valueOf(20));
        System.out.println("After remove(20): " + stack);

        // clear()
        stack.clear();
        System.out.println("After clear: " + stack);

        // isEmpty() not
        System.out.println("Is stack empty now? " + !stack.isEmpty());
    }
}