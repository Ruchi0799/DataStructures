package com.bridgelabz.practiceproblems;



public class MyStack<K>{
    public INode<K> head;
    public INode<K> tail;
    int index=0;

    public MyStack() {

    }

    public void push(INode<K> newNode)
    {
        index++;
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

    public K peek(){
        return this.head.getKey();
    }

    public void pop(){
        index--;
        this.head=this.head.getNext();
    }


    public boolean isEmpty() {
        return index == 0 ? true : false;
    }

    /* @Method This method returns the stack size */
    public int getStackSize() {
        return index;
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

