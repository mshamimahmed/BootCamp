package com.bridgelab.bootcamp.dummy;
public class Linkedlist
{
    Node head;
    static class Node
    {
        int data;
        Node next;
        Node(int d)
        {
            data=d;
            next=null;
        }
    }
    public static void main(String[] args)
    {
        Linkedlist ll =new Linkedlist();
        ll.head = new Node(10);
        Node second =new Node(10);
        Node third = new Node(35);
        ll.head.next=second;
        second.next=third;
        System.out.println("The first element:"+ll.head.data+" and its next node:"+ll.head.next.data);
        System.out.println("the second node"+second.data+"and its next node"+second.next.data);
        System.out.println("the third node"+third.data);
    
    }
}