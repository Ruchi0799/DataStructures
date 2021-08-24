package com.bridgelabz.linkedlist;

public class LinkedListRunner {
    public static void main(String[] args) {
        MyNode<Integer> myFirstNode=new MyNode<>(56);
        MyNode<Integer> mySecondNode=new MyNode<>(30);
        MyNode<Integer> myThirdNode=new MyNode<>(70);
        MyNode<Integer> myFourthNode=new MyNode<>(40);
        MyLinkedList myLinkedList=new MyLinkedList();
        myLinkedList.add(myFirstNode);
        myLinkedList.add(myThirdNode);
        myLinkedList.printMyNodes();
        myLinkedList.addNodeInBetween(myFirstNode,mySecondNode);
        System.out.println();
        myLinkedList.printMyNodes();
        //myLinkedList.pop();
        System.out.println();
        //myLinkedList.printMyNodes();
        //System.out.println();
        myLinkedList.search(mySecondNode);
        myLinkedList.addNodeAfter(mySecondNode,myFourthNode);
        //myLinkedList.printMyNodes();
        myLinkedList.printMyNodes();

    }
}
