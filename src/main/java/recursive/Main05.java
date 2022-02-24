package recursive;

import java.util.Scanner;

public class Main05 {

    private Node root;

    public Main05(Node root) {
        this.root = root;
    }

    public void DFS(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.getData() + " ");
        DFS(root.getLt());
        DFS(root.getRt());
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);
        Node node7 = new Node(7);

        node2.set(node4, node5);
        node3.set(node6, node7);
        root.set(node2, node3);

        Main05 main = new Main05(root);
        main.DFS(root);
    }

    static class Node {
        private int data;
        private Node lt;
        private Node rt;
        public Node(int data) {
            this.data = data;
        }

        public int getData() {
            return data;
        }

        public Node getLt() {
            return lt;
        }

        public Node getRt() {
            return rt;
        }

        public void set(Node lt, Node rt) {
            this.lt = lt;
            this.rt = rt;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "data=" + data +
                    ", lt=" + lt +
                    ", rt=" + rt +
                    '}';
        }
    }


}
