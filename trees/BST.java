public class BST {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static Node insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }

        if (root.data > val) {
            root.left = insert(root.left, val);
        } 
        else {
            root.right = insert(root.right, val);
        }

        return root;
    }

    static boolean search(Node root,int key){
        if(root==null){
            return false;
        }
        if(root.data==key)
            return true;
        if(root.data<key){
            return search(root.left,key);
        }
        if(root.data>key){
            return search(root.right,key);
        }
        return false;
    }

    static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    public static void main(String[] args) {
        int values[] = {5, 1, 3, 4, 2, 7};
        Node root = null;

        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }

        if(search(root,3)){
            System.out.println("element found");
        }
        else{
            System.out.println("element not found");
        }
        System.out.print("Inorder traversal: ");
        inorder(root);
        System.out.println();
    }
}