package com.brideglabz.stackandqueue;

public class MyStack<K>{
    public INode<K> head;
    public INode<K> tail;

    public MyStack() {

    }

    public void push(INode<K> newNode)
    {
        add(newNode);
    }

    public void add(INode<K> newNode) {
        if (this.tail == null) {
            this.tail = newNode;
        }
        if (this.head == null) {
            this.head = newNode;
        } else {
            INode<K> tempNode = this.head;
            this.head = newNode;
            this.head.setNext(tempNode);
        }
    }

    public void peek(){
        System.out.println(this.head.getKey());
    }

    public void pop(){
        this.head=this.head.getNext();
    }

    public void printMyNodes() {

        StringBuffer myNodes = new StringBuffer("My Nodes: ");
        INode temp = this.head;
        while (temp != null) {
            myNodes.append(temp.getKey());
            if ( temp != tail) {
                myNodes.append("->");
            }
            temp = temp.getNext();
        }
        System.out.println(myNodes);
    }

        }

