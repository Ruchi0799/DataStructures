package com.bridgelabz.linkedlist;

public class LinkedListRunner {
    public static void main(String[] args) {
        MyNode<Integer> myFirstNode=new MyNode<>(56);
        MyNode<Integer> mySecondNode=new MyNode<>(30);
        MyNode<Integer> myThirdNode=new MyNode<>(70);
        MyLinkedList myLinkedList=new MyLinkedList();
        myLinkedList.add(myFirstNode);
        myLinkedList.add(myThirdNode);
        myLinkedList.addNodeInBetween(myFirstNode,mySecondNode);
        myLinkedList.printMyNodes();
        myLinkedList.pop();
        System.out.println();
        myLinkedList.printMyNodes();
        System.out.println();
        myLinkedList.search(mySecondNode);

    }
}
