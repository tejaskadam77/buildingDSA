package com.learningdsa.udemy.linkedListExcercise;

public class SLLNode {
    int data;
    SLLNode next;

    SLLNode(int data)
    {
        this.data=data;
        this.next=null;
    }
    SLLNode()
    {
        this.data=Integer.MIN_VALUE;
        this.next=null;
    }
}
