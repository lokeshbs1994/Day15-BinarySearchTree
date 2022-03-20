/*@Purpose : Ability to create a BST by adding 56 and then
 * adding 30 & 70 - Use INode to create My Binary Node - Note the key has to extend comparable to
 * compare and determine left or right node
 * - First add 56 as root node so 30 will be added to left and 70 to right
 * @File : Binary Search Tree
 * @Author : Lokesh B S
 */
package com.bridgelabz;

class Node {
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
        Node left = null;
        Node right = null;
    }

    @Override
    public String toString() {
        return "Node [data=" + data + ", left=" + left + ", right=" + right + "]";
    }

}

/*
 * @Purpose : Insert Element in BST
 *
 * @Param : Node,Data
 *
 * @return : Node
 */
public class BST {

    public Node insert(Node node, int data) {

        if (node == null) {
            node = createNewNode(data);
        }

        if (data < node.data) {
            node.left = insert(node.left, data);
        } else if (data > node.data) {
            node.right = insert(node.right, data);
        }
        return node;
    }

    private Node createNewNode(int data) {
        Node mynode = new Node(data);
        return mynode;
    }

    public void printInorder(Node node) {
        if (node == null) {
            return;
        }
        printInorder(node.left);
        System.out.print(node.data + "->");
        printInorder(node.right);

    }
}