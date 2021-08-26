package com.bridgelabz.practiceproblems;


public class UnorderedListTest {
    public static void main(String[] args) {
        MyLinkedList myLinkedList=new MyLinkedList();
        String sentence="Paranoids are not paranoid because they are";
        String[] words=sentence.toLowerCase().split(" ");
        for (String word:words) {
            MyNode<String> myFirstNode=new MyNode<>(word);
            myLinkedList.add(myFirstNode);
        }
        myLinkedList.printMyNodes();

        MyNode<String> searchNode=new MyNode<>("ruchi");


        if(myLinkedList.search(searchNode.getKey())==null) {
            System.out.println();
            System.out.println("Adding it to the list");
            myLinkedList.add(searchNode);
            System.out.println();
            myLinkedList.printMyNodes();
        }
        else
        {
            myLinkedList.delete("ruchi");
            System.out.println();
            myLinkedList.printMyNodes();
        }
        }

    }

