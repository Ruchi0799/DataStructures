package com.brideglabz.stackandqueue;


public class StackRunner {

    public static void main(String[] args) {
        MyNode<Integer> myFirstNode=new MyNode<>(70);
        MyNode<Integer> mySecondNode=new MyNode<>(30);
        MyNode<Integer> myThirdNode=new MyNode<>(56);
        MyStack myStack=new MyStack();
        myStack.push(myFirstNode);
        myStack.push(mySecondNode);
        myStack.push(myThirdNode);
        System.out.println("PRINTING MY NODES:");
        myStack.printMyNodes();
        System.out.println("PEEP NODE:");
        myStack.peek();
        myStack.pop();
        System.out.println("NODES AFTER POP OPERATION");
        myStack.printMyNodes();


    }
}
