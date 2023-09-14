package com.learningdsa.udemy.tree;

import java.util.Scanner;

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}

public class TreeDemo {
    Node root = null;

    public void populate(Scanner scanner) {
        System.out.println("enter value for root node");
        root = new Node(scanner.nextInt());
        populate(scanner, root);


    }

    private void populate(Scanner scanner, Node node) {
        System.out.println("do you want to add node to left of " + node.data);
        boolean toLeft = scanner.nextBoolean();
        if (toLeft) {
            System.out.println("enter value for left data");
            node.left = new Node(scanner.nextInt());
            populate(scanner, node.left);
        }

        System.out.println("do you want to add node to right of " + node.data);
        boolean toRight = scanner.nextBoolean();
        if (toRight) {
            System.out.println("enter value for right data");
            node.right = new Node(scanner.nextInt());
            populate(scanner, node.right);
        }
    }

    public void display() {
        System.out.println("");
        display(root);
    }

    private void display(Node node) {
        if(node !=null)
            return;
        System.out.println(node.data);
        display(node.left);
        display(node.right);
    }

    public static void main(String[] args) {

    }
}
