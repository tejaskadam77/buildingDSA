package com.learningdsa.udemy.queuedemo;

public class CircularQueue {
    int topOfQueue = -1;
    int beginningOfQueue = -1;
    int size;
    int a[];

    CircularQueue(int size) {
        this.size = size;
        this.a = new int[size];
    }

    public boolean isEmpty() {
        if (topOfQueue == -1) {
            return true;
        } else
            return false;
    }

    public boolean isFull() {
        if (topOfQueue + 1 % size == beginningOfQueue) {
            return true;
        } else
            return false;
    }

    public void add(int data) {
        if (isFull()) {
            System.out.println("Queue is already full");

        } else {
            if (beginningOfQueue == -1) {
                beginningOfQueue = 0;
            }
            topOfQueue = topOfQueue + 1 % size;
            a[topOfQueue] = data;
        }


    }

    public void remove() {
        if (isEmpty()) {
            System.out.println("Queue is already Empty");
        } else {
            System.out.println(a[beginningOfQueue]);

            if (topOfQueue == beginningOfQueue) {
                topOfQueue = beginningOfQueue = -1;
            } else {

                beginningOfQueue = beginningOfQueue + 1 % size;
            }
        }
    }

}
