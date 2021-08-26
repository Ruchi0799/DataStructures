package com.bridgelabz.linkedlist;

public class MyLinkedList<K> {
    public INode<K> head;
    public INode<K> tail;

    public MyLinkedList() {

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


    public void addNodeInBetween(INode<K> myFirstNode,INode<K> mySecondNode)
    {
        INode tempNode = this.head;
       if(tempNode.getKey()!=myFirstNode) {
           mySecondNode.setNext(tempNode.getNext());
           tempNode.setNext(mySecondNode);
       }

    }

    public void addNodeAfter(INode<K> mySecondNode,INode<K> myFourthNode) {
        INode tempNode = this.head;
        while (tempNode!= null) {
            if (tempNode.getKey().equals(mySecondNode.getKey())) {
                myFourthNode.setNext(tempNode.getNext());
                tempNode.setNext(myFourthNode);
                break;
            }
            tempNode=tempNode.getNext();
        }
    }

    public void pop(){
        INode tempNode=this.head;
        this.head=tempNode.getNext();

    }

    public void deleteNode(INode<K> mySecondNode,INode<K> myFourthNode)
    {
        INode tempNode = this.head;
        while (tempNode!= null) {
            if (tempNode.getKey().equals(mySecondNode.getKey())) {
                mySecondNode.setNext(myFourthNode.getNext());
                break;
            }
            tempNode=tempNode.getNext();
        }

    }

    public void search(INode<K> searchNode){
        INode tempNode=this.head;
        while (tempNode.getNext()!=null)
        {

            if (tempNode==searchNode)
            {
                System.out.println(searchNode.getKey() +" is present");
            }
            tempNode=tempNode.getNext();

        }

    }



    public void sortNodes(){
        INode tempNode=this.head;
        INode minNode=this.head;
        while (tempNode.getNext()!=null) {
            /*if(minNode.getKey()tempNode.getKey())
            {

            }*/


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

