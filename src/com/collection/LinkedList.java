package com.collection;

public class LinkedList {
    private Node head;
    private Node tail;

    private class Node{
      private int val;
      private Node next;

       public Node(int val){
            this.val=val;
        }

        public Node(int val, Node next){
            this.val=val;
            this.next=next;
        }
    }

    public void addLast(int val){

        if (head==null){
            head= new Node(val,null);
            tail=head;
            return;
        }
        Node temp = new Node(val);
        tail.next=temp;
        tail=temp;
    }

    public void addFirst(int val){

        if (head==null){
            head= new Node(val,null);
            tail=head;
            return;
        }
        Node temp = new Node(val);
        temp.next=head;
        head=temp;
    }

    public void addIndex(int val,int index){

        if (head==null){
            head= new Node(val,null);
            tail=head;
            return;
        }
        Node temp = head;
        while(index>0 && temp!=null){
            temp=temp.next;
            index--;
        }
        if(index>0){
            System.out.println("Number of elements less than index");
            return;
        }
        Node nextNode= temp;
        Node addNode1= new Node(val);
        temp.next= addNode1;
        addNode1.next=nextNode;

    }

    public void displayList(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+"->");
            temp=temp.next;
        }
        System.out.println("END");
    }
}


