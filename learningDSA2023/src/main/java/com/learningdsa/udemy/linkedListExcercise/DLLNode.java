package com.learningdsa.udemy.linkedListExcercise;

public class DLLNode {
    int data;
    DLLNode prev;
    DLLNode next;

    DLLNode(int data) {
        this.data = data;
        this.next = this.prev = null;

    }
}
