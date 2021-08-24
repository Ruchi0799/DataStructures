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
        System.out.println("Adding node in between 56 and 70");
        myLinkedList.printMyNodes();
        System.out.println();
        System.out.println("Searching 30 in list");
        myLinkedList.search(mySecondNode);
        myLinkedList.addNodeAfter(mySecondNode,myFourthNode);
        System.out.println("Adding node 40...");
        myLinkedList.printMyNodes();
        System.out.println();
        System.out.println("Deleting node 40...");
        myLinkedList.deleteNode(mySecondNode,myFourthNode);
        myLinkedList.printMyNodes();


    }
}
