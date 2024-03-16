package com.learningdsa.udemy.linkedListExcercise;

public class CircularSLL {

    SLLNode head;
    SLLNode tail;
    int size;

    public SLLNode createCSLL(int data) {
        SLLNode newNode = new SLLNode(data);
        newNode.next = newNode;
        size = 1;
        head = tail = newNode;
        return head;
    }

    public void insert(int data, int location) {
        SLLNode newNode = new SLLNode(data);
        if (head == null) {
            createCSLL(data);
        } else if (location == 0) {
            newNode.next = head;
            head = newNode;
            tail.next = newNode;
        } else if (location >= size) {
            tail.next = newNode;
            newNode.next = head;
            tail = newNode;
        } else {
            SLLNode temp = head;
            for (int i = 0; i < location - 1; i++) {
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next = newNode;
        }
        size++;
    }

    public void printCSLL() {
        SLLNode current = head;
        if (head == null) {
            System.out.println("list is empty");
        } else {
            do {
                System.out.println(current.data);
                current = current.next;
            } while (current != head);
        }
    }

    public void searchCSLL(int key) {
        SLLNode current = head;
        if (head == null) {
            System.out.println("list is empty");
        } else {
            int index = 0;
            int flag = 0;
            do {
                if (current.data == key) {
                    System.out.println("key exist at " + index);
                    return;
                } else {
                    index++;
                    current = current.next;
                }
            } while (current != head);
            System.out.println("key does not exist");
        }
    }

    public void deleteNode(int location) {
        if (head == null) {
            System.out.println("list is empty");
        } else if (location == 0) {
            if (head == tail) {
                head = tail = null;
            } else {
                head = head.next;
                tail.next = head;
            }
            size--;
        } else if (location >= size) {
            SLLNode temp = head;
            for (int i = 0; i < size - 1; i++) {
                temp = temp.next;
            }
            temp.next=head;
            tail=temp;
            size--;
        }
        else
        {
            SLLNode temp = head;
            for (int i = 0; i < location - 1; i++) {
                temp = temp.next;
            }
        }
    }

    public static void main(String[] args) {

    }
}
