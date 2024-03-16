package com.learningdsa.udemy.linkedListExcercise;

public class CircularDLLList {
    DLLNode head;

    public void printDLL() {
        if (head == null) {
            System.out.println("list is empty");
        } else {
            DLLNode current = head;
            do {
                System.out.print(current.data);
                if (current.next != head) {
                    System.out.print("-->");
                }
                current = current.next;
            } while (current != head);
            System.out.println();
        }
    }

    public void add(int data) {
        DLLNode nodeToAdd = new DLLNode(data);
        if (head == null) {
            head = nodeToAdd;
            head.next = head;
            head.prev = head;
        } else {
            DLLNode current;
            current = head;
            while (current.next != head) {
                current = current.next;
            }
            current.next = nodeToAdd;
            nodeToAdd.prev = current;
            nodeToAdd.next = head;
            head.prev = nodeToAdd;
        }
    }

    public void insertAtBeg(int data) {
        DLLNode nodeToAdd = new DLLNode(data);
        if (head == null) {
            head = nodeToAdd;
            head.next = head;
            head.prev = head;
        } else {
            DLLNode last = head;
            while (last.next != head) {
                last = last.next;
            }
            nodeToAdd.next = head;
            nodeToAdd.prev = last;
            head.prev = nodeToAdd;
            last.next = nodeToAdd;
            head = nodeToAdd;
        }
    }

    public void deleteEven() {
        if (head != null && head.next != head) {
            DLLNode odd = head;
            DLLNode even = head.next;
            while (true) {
                DLLNode temp = odd;
                odd.next = even.next;
                odd = even.next;
                even = odd.next;
                even = null;
                if (odd == head || even == head) {
                    break;
                }
                if (odd == head) {
                    temp.next = head;
                    head.prev = temp;
                } else {
                    odd.next = head;
                    head.prev = odd;
                }
            }

        }

    }

    public static void main(String[] args) {

        CircularDLLList d = new CircularDLLList();
        d.printDLL();
        d.add(10);
        d.add(20);
        d.add(30);
        d.printDLL();
        d.insertAtBeg(67);
        d.printDLL();
    }
}
