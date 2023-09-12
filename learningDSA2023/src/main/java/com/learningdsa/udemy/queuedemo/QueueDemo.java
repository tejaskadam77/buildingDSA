package com.learningdsa.udemy.queuedemo;

public class QueueDemo {
    int rear = -1;
    int front = -1;
    int[] arr;

    QueueDemo(int size) {
        arr = new int[size];
    }

    public boolean isFull() {
        if (rear == arr.length - 1)
            return true;
        else
            return false;
    }

    public boolean isEmpty() {
        if (rear == -1)
            return true;
        else
            return false;
    }

    public void enque(int data) {
        if (isFull()) {
            System.out.println("queue is already full");
        } else {
            if (isEmpty()) {
                front = 0;
                rear++;
                arr[rear] = data;
            } else {
                rear++;
                arr[rear] = data;
            }

        }
    }

    public void deque() {
        if (rear == -1) {
            System.out.println("queue is already empty");
        } else {
            int result = arr[front];
            front++;
            if (front > rear) {
                front = rear = -1;
            }
            System.out.println(result);
        }

    }

    public void peek() {
        if (rear == -1) {
            System.out.println("queue is already empty");
        } else {
            int result = arr[front];
            System.out.println(result);


        }
    }
}

