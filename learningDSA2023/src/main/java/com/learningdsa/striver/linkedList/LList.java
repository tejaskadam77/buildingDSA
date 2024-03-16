package com.learningdsa.striver.linkedList;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class LList {
   public static Node head;


        public static void main(String[] args) {
            head=new Node(10);
            head.next=new Node(20);
            head.next.next=new Node (30);
            head.next.next.next=new Node (40);
            head.next.next.next.next=new Node (50);
            head.next.next.next.next.next=head.next.next;
            System.out.println(findLoop(head));



        }

    private static boolean findLoop(Node head) {
            Node slow=head;
            Node fast=head;
            while(fast!=null && fast.next!=null)
            {
                slow= slow.next;
                fast=fast.next.next;
                if(slow==fast)
                    return true;
            }
            return false;

    }

    private static Node findLoopWithPosition(Node head) {
        Node slow=head;
        Node fast=head;
        while(fast!=null && fast.next!=null)
        {
            slow= slow.next;
            fast=fast.next.next;
            if(slow==fast)
                slow=head;
            while(slow!=fast)
            {
                slow=slow.next;
                head=head.next;

            }
            if(slow==fast)
            return slow;
        }
        return null;

    }


}
