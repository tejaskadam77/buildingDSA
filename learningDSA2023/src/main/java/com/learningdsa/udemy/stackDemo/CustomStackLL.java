package com.learningdsa.udemy.stackDemo;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class CustomStackLL {

    int top = -1;
    Node headStack = null;

    public boolean isEmpty() {
        if (top == -1)
            return true;
        return false;
    }

    public void push(int data) {
        Node newNode = new Node(data);
        if (!isEmpty()) {

            newNode.next = this.headStack;
        }
        this.headStack = newNode;
        top++;
    }

    public void pop() {
        if (headStack == null) {
            System.out.println("stack is empty");
        } else {
            System.out.println(this.headStack.data);
            this.headStack = this.headStack.next;
            top--;
        }
    }


    public void peek() {
        if (headStack == null) {
            System.out.println("stack is empty");
        } else {

            System.out.println(this.headStack.data);

        }
    }
}
