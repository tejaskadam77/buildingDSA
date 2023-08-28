package com.learningdsa.udemy.linkedListExcercise;

public class SingleLinkedList {
    SLLNode head;

    public int size = 0;

    public SLLNode createSinglyLinkedList(int data) {
        SLLNode newNode = new SLLNode(data);
        head = newNode;
        size = 1;
        return head;

    }

    public void insert(int data) {
        SLLNode newNode = new SLLNode(data);
        if (head == null) {
            head = newNode;
        } else {
            SLLNode last = head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = newNode;
            newNode.next = null;

        }
    }

    public void deleteAtBeginning() {

        if (head == null) {
            System.out.println("list is already empty");
        } else {
            head = head.next;
        }
    }

    public void deleteFromEnd() {

        if (head == null) {
            System.out.println("list is already empty");
        } else {
            SLLNode prev = null;
            SLLNode current = head;
            while (current.next != null) {
                prev = current;
                current = current.next;
            }
            if (prev == null) {
                head = null;
            } else {
                prev.next = current.next;
            }
        }
    }
    public void deleteWithData(int data) {

        if (head == null) {
            System.out.println("list is already empty");
        } else {
            SLLNode prev = null;
            SLLNode current = head;
            while (current.next != null && current.data!=data) {
                prev = current;
                current = current.next;
            }
            if (prev == null) {
                head = null;
            } else {
                prev.next = current.next;
            }
        }
    }

    public void insertWithPosition(int data, int pos) {
        SLLNode newNode = new SLLNode(data);
        if (head == null) {
            head = newNode;
        } else if (pos == 0) {
            head.next = newNode;
            head = newNode;
        } else {
            SLLNode current = head;
            int index = 0;
            while (current.next != null && pos != index - 1) {
                current = current.next;
                index++;
            }

            newNode.next = current.next;
            current.next = newNode;
        }
    }

    public void searchLL(int data) {
        if (head == null) {
            System.out.println("list is empty");
        } else {
            SLLNode currentNode = head;
            while (currentNode != null) {
                if (currentNode.data == data) {
                    System.out.println("node is present with given data");
                    return;
                }
                currentNode = currentNode.next;
            }
            System.out.println("node is not present with given data");
        }

    }

    public void printList() {
        if (head == null) {
            System.out.println("list is empty");
        } else {
            SLLNode currentNode = head;
            while (currentNode != null) {
                System.out.print(currentNode.data);
                if (currentNode.next != null) {
                    System.out.print(" ---> ");
                }
                currentNode = currentNode.next;
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        SingleLinkedList s = new SingleLinkedList();
        s.printList();
        s.insert(10);
        s.insert(20);
        s.insert(30);
        s.deleteFromEnd();
        s.printList();

    }
}
