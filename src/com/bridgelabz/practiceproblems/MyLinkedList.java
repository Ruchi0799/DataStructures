package com.bridgelabz.practiceproblems;

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


    public void delete(K key) {
        INode tempNode = head;
        INode prevNode = null;

        while(tempNode != null) {
            if (tempNode.getKey().equals(key)) {
                tempNode = tempNode.getNext();
                prevNode.setNext(tempNode);
                break;
            }
            prevNode = tempNode;
            tempNode = tempNode.getNext();
        }

    }

    public INode<K> search(K key) {
        INode temp = head;
        int flag = 1;
        while (temp!=null) {
            if (temp.getNext()!=null && (temp.getNext().getKey().equals(key))) {
                flag = 0;
                return temp;
            }
            temp = temp.getNext();
        }
        if (flag == 1) return null;
        return null;
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

