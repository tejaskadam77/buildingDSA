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

    public void deleteFirstOccurenceWithKey(int data) {
        if (head == null) {
            System.out.println("list is already empty");

        } else {
            SLLNode current = head;
            SLLNode prev = null;

            while (current != null) {
                if (current.data == data) {
                    if (prev == null) {
                        head = head.next;
                    } else {
                        prev.next = current.next;
                        current = null;
                    }
                    break;
                } else {
                    prev = current;
                    current = current.next;
                }

            }

        }

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
            while (current.next != null && current.data != data) {
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

    public void reverse() {
        if (head == null) {
            System.out.println("list is already empty");
        } else {
            SLLNode cur = head;
            SLLNode prev = null;
            while (cur != null) {
                SLLNode nextNode = cur.next;
                cur.next = prev;
                prev = cur;
                cur = nextNode;
            }
            head=prev;
        }
    }

    
    public void deleteDuplicates() {
        if(head==null||head.next==null)
            return;
        SLLNode ptr1=head;
        SLLNode ptr2=head.next;
        while(ptr2!=null)
        {
            if(ptr1.data==ptr2.data)
            {
                ptr1.next=ptr2.next;
            }
            else
            {
                ptr1=ptr2;
            }
            ptr2=ptr2.next;
        }
    }

    public void partition(int x)
    {
        if(head==null||head.next==null)
            return;
        else
        {
            SLLNode prev=head;
            SLLNode cur=head.next;
            while(cur!=null)
            {
                if(cur.data<x)
                {

                    prev.next=cur.next;
                    cur.next=head;
                    head=cur;
                    cur=prev.next;
                }
                else
                {
                    prev=cur;
                    cur=cur.next;
                }
            }

        }
    }
    public static void main(String[] args) {
        SingleLinkedList s = new SingleLinkedList();

        s.insert(10);
        s.insert(20);
        s.insert(20);
        s.insert(30);
        s.insert(30);
        s.printList();
        s.deleteDuplicates();

        s.printList();
//        System.out.println("++++++++++++++++++++++++++");
//        s.reverse();
//        s.printList();

    }
}
