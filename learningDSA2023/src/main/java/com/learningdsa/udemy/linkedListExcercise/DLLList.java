package com.learningdsa.udemy.linkedListExcercise;

public class DLLList {

    DLLNode head;

    public static void main(String[] args) {
        DLLList list=new DLLList();
        DLLNode first=new DLLNode(10);



        DLLNode sec=new DLLNode(20);
        DLLNode third=new DLLNode(30);
        DLLNode fourth=new DLLNode(40);
        list.head=first;
        first.next=sec;
        sec.prev=first;
        sec.next=third;
        third.prev=sec;
        third.next=fourth;
        fourth.prev=third;

        list.printDLL();
        list.reverseList();
        System.out.println("++++++++++++++++++++++++++++++");
        list.printDLL();

    }


    public void insertAtBeginning(int data) {
        DLLNode dl = new DLLNode(data);
        if (head != null) {
            dl.next = head;
            head.prev = dl;
        }
        head = dl;
    }

    public void deleteFromBeginning() {
        if (head == null) {
            System.out.println("list is already empty");
        } else {
            head = head.next;
            if (head != null)
                head.prev = null;
        }
    }

    public void deleteFromEnd() {
        if (head == null) {
            System.out.println("list is already empty");
        } else {
            DLLNode current = head;
            DLLNode prev = null;
            while (current.next != null) {
                current = current.next;
                prev = current;
            }
            if (prev == null) {
                head = null;
            } else {
                prev.next = null;
            }
        }
    }

    public void printDLL() {
        DLLNode currentNode;
        currentNode = head;
        if (currentNode == null) {
            System.out.println("List is empty");
        }
        while (currentNode != null) {
            System.out.println(currentNode.data);
            currentNode = currentNode.next;
        }
    }

    public void reverseList()
    {
        DLLNode curr=head;
        if(curr==null )
        {
            System.out.println("list is already empty");
        }
        else
        {
            DLLNode prev=null;
            while(curr!=null)
            {
                DLLNode nextNode=curr.next;
                curr.prev=curr.next;
                curr.next=prev;
                prev=curr;
                curr=nextNode;
            }
            head=prev;
        }
    }

    public void insertAtEnd(int data) {
        DLLNode currentNode;
        currentNode = head;
        if (currentNode == null) {
            insertAtBeginning(data);
        } else {
            DLLNode dl = new DLLNode(data);

            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = dl;
            dl.prev = currentNode;

        }


    }

    public void insertAtPosition(int index, int data) {

        if (index == 1) {
            insertAtBeginning(data);
        }
        DLLNode currentNode;
        currentNode = head;
        DLLNode dl = new DLLNode(data);
        int count = 1;
        while (currentNode.next != null && count < index - 1) {
            currentNode = currentNode.next;
            count++;
        }
        dl.next = currentNode.next;
        currentNode.next.prev = dl;
        dl.prev = currentNode;
        currentNode.next = dl;


    }

}
