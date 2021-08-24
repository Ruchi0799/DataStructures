package com.bridgelabz.linkedlist;

public class MyNode<T> {
    private T key;
    private MyNode next;

    public T getKey() {
        return key;
    }

    public void setKey(T key) {
        this.key = key;
    }

    public MyNode getNext() {
        return next;
    }

    public void setNext(MyNode next) {
        this.next = next;
    }

    public MyNode(T key) {
        this.key = key;
        this.next=null;
    }
}
