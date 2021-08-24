package com.brideglabz.stackandqueue;

public class MyQueue<K> {
    public INode<K> head;
    public INode<K> tail;

    public MyQueue() {

    }

    public void enqueue(INode<K> newNode)
    {
        add(newNode);
    }

    public void dequeue()
    {
        this.head=this.head.getNext();
    }

    public void add(INode<K> newNode) {
        if (this.head == null) {
            this.head = newNode;
        }
        if (this.tail == null) {
            this.tail = newNode;
        }
        else {
            INode tempNode = this.head;
            while (tempNode.getNext()!=null)
            {
                tempNode=tempNode.getNext();
            }
            tempNode.setNext(newNode);
            newNode.setNext(null);
        }
    }



    public void printMyNodes() {

        StringBuffer myNodes = new StringBuffer("My Nodes: ");
        INode temp = this.head;
        while (temp.getNext()!=null) {
            myNodes.append(temp.getKey());
            myNodes.append("->");
            temp = temp.getNext();
        }
        myNodes.append(temp.getKey());
        System.out.print(myNodes);


    }
}
