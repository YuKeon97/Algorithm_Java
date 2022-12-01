package Ch7;

import org.w3c.dom.Node;

public class Binary_Search_DFS_5 {
    Node root;
    public static void main(String[] args) {
        Binary_Search_DFS_5 tree=new Binary_Search_DFS_5();
        tree.root=new Node(1);
        tree.root.lt=new Node(2);
        tree.root.rt=new Node(3);
        tree.root.lt.lt=new Node(4);
        tree.root.lt.rt=new Node(5);
        tree.root.rt.lt=new Node(6);
        tree.root.rt.rt=new Node(7);
        tree.DFS(tree.root);

    }

    public static class Node {
        int data;
        Node lt, rt;

        public Node(int val) {
            this.data = val;
            lt = rt = null;
        }
    }

    public void DFS(Node root) {
        if (root == null) {
            return;
        } else {
            System.out.print(root.data);
            DFS(root.lt);
            DFS(root.rt);
        }
    }

}
