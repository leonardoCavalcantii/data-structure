
class Bst {
    private Node root;

    public boolean isEmpty() {
        return this.root == null;
    }

    // inserção recursiva.
    public void insertRecursive(int v) {
        if (isEmpty())
            this.root = new Node(v);
        insertRecursive(this.root, v);
    }

    private void insertRecursive(Node node, int v) {
        if (v < node.value) {
            if (node.left == null) {
                Node newNode = new Node(v);
                node.left = newNode;
                newNode.parent = node;
                return;
            }
            insertRecursive(node.left, v);
        } else {
            Node newNode = new Node(v);
            node.right = newNode;
            newNode.parent = node;
            return;
        }
        insertRecursive(node.right, v);

    }

    // inserção iterativa.
    public void insert(int v) {
        if (isEmpty()) {
            this.root = new Node(v);
        } else {
            Node aux = this.root;
            while (aux != null) {
                if (v < aux.value) {
                    if (aux.left == null) {
                        Node newNode = new Node(v);
                        aux.left = newNode;
                        newNode.parent = aux;
                        break;
                    }
                    aux = aux.left;
                } else {
                    if (aux.right == null) {
                        Node newNode = new Node(v);
                        aux.right = newNode;
                        newNode.parent = aux;
                        break;
                    }
                    aux = aux.right;
                }
            }
        }

    public void printInOrder() {
        printInOrder(this.root);
    }

    private void printInOrder(Node node) {
        if (node != null) {
            printInOrder(node.left);
            System.out.println(node.value + " ");
            printInOrder(node.right);
        }
    }

    // busca iterativa.
    public Node search(int v) {
        Node aux = this.root;
        while (aux != null) {
            if (aux.value == v)
                return aux;
            if (v < aux.value)
                aux = aux.left;
            if (v > aux.value)
                aux = aux.right;
        }
        return null;
    }

    // busca recursiva.
    public Node searchRecursive(int v) {
        return searchRecursive(this.root, v);
    }

    private Node searchRecursive(Node node, int v) {
        if (node == null)
            return null;
        if (v == node.value)
            return node;
        if (v < node.value)
            return searchRecursive(node.left, v);
        return searchRecursive(node.right, v);
    }

    public Node min() {
        if (isEmpty())
            return null;
        return min(this.root);
    }

    private Node min(Node node) {
        if (node.left == null)
            return node;
        return min(node.left);
    }

    public Node max() {
        if (isEmpty())
            return null;
        return max(this.root);
    }

    private Node max(Node node) {
        if (node.right == null)
            return node;
        return max(node.right);
    }

    public Node sucessor(Node node) {
        if (node == null)
            return null;
        if (node.right != null)
            return min(node.right);
        else {
            Node aux = node.parent;

            while (aux != null && aux.value < node.value)
                aux = aux.parent;
            return aux;
        }

    }

    public Node predecessor(Node node) {
        if (node == null)
            return null;
        if (node.left != null)
            return max(node.left);
        else {
            Node aux = node.parent;

            while (aux != null && aux.value > node.value)
                aux = aux.parent;
            return aux;
        }
    }
}

class Node {
    int value;
    Node left;
    Node right;
    Node parent;

    Node(int v) {
        this.value = v;
    }

    public String toString() {
        return String.valueOf(value);
    }

    public boolean isLeaf() {
        return left == null && right == null;
    }
}

public class Main {
    public static void main(String[] args) {
        Bst bst = new Bst();
        System.out.println("arvore");
        bst.insertRecursive(10);
        bst.insertRecursive(11);
        bst.insertRecursive(9);
        bst.insertRecursive(3);
        bst.printInOrder();
        System.out.println("----------------------------------");
        int node1 = 9;
        Node result = bst.search(node1);
        System.out.println("busca iterativa");
        System.out.println(result);
        System.out.println("----------------------------------");
        int node2 = 9;
        Node result2 = bst.searchRecursive(node2);
        System.out.println("busca recursiva");
        System.out.println(result2);
        System.out.println("----------------------------------");
        Node maxNode = bst.max();
        System.out.println(maxNode);
        Node minNode = bst.min();
        System.out.println(minNode);
    }
}
