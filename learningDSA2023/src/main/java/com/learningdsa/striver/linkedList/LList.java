package com.learningdsa.striver.linkedList;

import learningJava.Basic;
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
class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class LList extends Basic{
    public static void print (ListNode head)
    {
        ListNode temp=head;
        while(temp!=null)
        {
            System.out.print(temp.val+"\t");
            temp=temp.next;
        }
    }
   public static ListNode head;


        public static void main(String[] args) {
            Basic b = new Basic();


            ListNode head=new ListNode(10);
            head.next=new ListNode(20);
            head.next.next=new ListNode (30);
            head.next.next.next=new ListNode (20);
            head.next.next.next.next=new ListNode (10);

            System.out.println(isPalindrome(head));



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
        while(fast!=null && fast.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                slow = head;
                while (slow != fast) {
                    slow = slow.next;
                    fast = fast.next;

                }
                if (slow == fast)
                    return slow;
            }
        }
        return null;

    }

    public static ListNode  reverseList(ListNode head)
    {
        ListNode temp=head;
        ListNode prev=null;
        while(temp!=null)
        {
            ListNode next=temp.next;
            temp.next=prev;
            prev=temp;
            temp=next;

        }
        return prev;
    }
    public ListNode oddEvenList(ListNode head) {
        if(head==null || head.next==null)
            return head;
        ListNode odd=head;
        ListNode even=head.next;
        ListNode evenHead=head.next;

        while(even!=null && even.next!=null)
        {
            odd.next=odd.next.next;
            even.next=even.next.next;
            odd=odd.next;
            even=even.next;
        }
        odd.next=evenHead;
        return head;


    }
    public static boolean isPalindrome(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        if(head==null || head.next==null)
        {
            return true;
        }
        while(fast.next!=null && fast.next.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;

        }
        ListNode newHead=slow.next;
        ListNode prev=reverseList(newHead);
        ListNode first=head;
        ListNode second=prev;
print(second);
        while(second!=null)
        {
            if(first.val!=second.val)
            {
                return false;
            }
            else
            {
                first=first.next;
                second=second.next;
            }
        }
        return true;

    }
    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode fast=head;
        ListNode slow=head;
        int i=0;
        while( i<n)
        {
            fast=fast.next;
            i++;
        }
        if(fast==null)
        {
            return head.next;
        }
        while(fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next;
        }

        slow.next=slow.next.next;
        return head;
    }

}
