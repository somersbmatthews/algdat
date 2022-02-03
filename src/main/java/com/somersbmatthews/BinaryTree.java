package com.somersbmatthews;

import java.util.LinkedList;
import java.util.Queue;

import org.w3c.dom.Node;

public class BinaryTree {

    Node root;

    // function to print Right view of
    // binary tree
    void rightView(BinaryNode root) {
        if (root == null) {
            return;
        }

        Queue<BinaryNode> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {

            // get number of nodes for each level
            int n = q.size();

            // traverse all the nodes of the current level
            for (int i = 0; i < n; i++) {
                BinaryNode curr = q.peek();
                q.remove();

                // print the last node of each level
                if (i == n - 1) {
                    System.out.print(curr.value);
                    System.out.print(" ");
                }

                // if left child is not null add it into
                // the
                // queue
                if (curr.left != null) {
                    q.add(curr.left);
                }

                // if right child is not null add it into
                // the
                // queue
                if (curr.right != null) {
                    q.add(curr.right);
                }
            }
        }
    }

    BinaryNode search(BinaryNode node, int value) {
        if (node == null) {
            return null;
        } else if (node.value == value) {
            return node;
        } else if (value < node.value) {
            return search(node.left, value);
        } else {
            return search(node.right, value);
        }
    }

}
