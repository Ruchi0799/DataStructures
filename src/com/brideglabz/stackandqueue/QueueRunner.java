package com.brideglabz.stackandqueue;

public class QueueRunner {
    public static void main(String[] args) {
        MyNode<Integer> myFirstNode=new MyNode<>(56);
        MyNode<Integer> mySecondNode=new MyNode<>(30);
        MyNode<Integer> myThirdNode=new MyNode<>(70);
        MyQueue myQueue=new MyQueue();
        myQueue.enqueue(myFirstNode);
        myQueue.enqueue(mySecondNode);
        myQueue.enqueue(myThirdNode);
        System.out.println("PRINTING MY NODES");
        myQueue.printMyNodes();
        myQueue.dequeue();
        System.out.println();
        System.out.println("AFTER DEQUEUE");
        myQueue.printMyNodes();

    }
}
