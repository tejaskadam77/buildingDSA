package com.learningdsa.udemy.tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    TreeNode(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}

public class TreeDemo {
    TreeNode root = null;

    public void populate(Scanner scanner) {
        System.out.println("enter value for root node");
        root = new TreeNode(scanner.nextInt());
        populate(scanner, root);


    }

    private void populate(Scanner scanner, TreeNode treeNode) {
        System.out.println("do you want to add node to left of " + treeNode.data);
        boolean toLeft = scanner.nextBoolean();
        if (toLeft) {
            System.out.println("enter value for left data");
            treeNode.left = new TreeNode(scanner.nextInt());
            populate(scanner, treeNode.left);
        }

        System.out.println("do you want to add node to right of " + treeNode.data);
        boolean toRight = scanner.nextBoolean();
        if (toRight) {
            System.out.println("enter value for right data");
            treeNode.right = new TreeNode(scanner.nextInt());
            populate(scanner, treeNode.right);
        }
    }

    public void display() {
        System.out.println("");
        display(root);
    }

    private void display(TreeNode treeNode) {
        if (treeNode == null)
            return;
        System.out.println(treeNode.data);
        display(treeNode.left);
        display(treeNode.right);
    }

    void levelOrderTraversal() {
        Queue<TreeNode> tq = new LinkedList<TreeNode>();
        tq.add(root);
        while (!tq.isEmpty()) {
            TreeNode presentNode = tq.remove();
            System.out.println(presentNode.data);
            if (presentNode.left != null) {
                tq.add(presentNode.left);
            }
            if (presentNode.right != null) {
                tq.add(presentNode.right);
            }
        }
    }

    void levelOrderTraversal(TreeNode nodeToSearch) {
        Queue<TreeNode> tq = new LinkedList<TreeNode>();
        tq.add(root);
        while (!tq.isEmpty()) {
            TreeNode presentNode = tq.remove();
            if (presentNode.data == nodeToSearch.data) {
                System.out.println("Node found");
                return;
            }

            if (presentNode.left != null) {
                tq.add(presentNode.left);
            }
            if (presentNode.right != null) {
                tq.add(presentNode.right);
            }
        }
        System.out.println("Node not present");
    }

    void insert(int data) {
        if (this.root == null) {
            root = new TreeNode(data);
            return;
        } else {
            Queue<TreeNode> tq = new LinkedList<TreeNode>();
            tq.add(root);
            while (!tq.isEmpty()) {
                TreeNode presentNode = tq.remove();
                if (presentNode.left == null) {
                    presentNode.left = new TreeNode(data);
                    System.out.println("successfully inserted data");
                    return;
                } else if (presentNode.right == null) {
                    presentNode.right = new TreeNode(data);
                    System.out.println("successfully inserted data");
                    return;
                } else {
                    tq.add(presentNode.left);
                    tq.add(presentNode.right);
                }
            }

        }

    }

    public static void main(String[] args) {
        int a[]=new int[3];
        a[0]=1;a[1]=2;a[2]=3;
for(int i=3;i>=1;i--)
{
    for(int j=i;j>=1;j--)
    {
        for(int k=0;k<j;k++)
        {
            System.out.print("");
        }
    }
}
    }
}
