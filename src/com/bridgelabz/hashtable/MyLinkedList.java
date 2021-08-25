package com.bridgelabz.hashtable;


public class MyLinkedList<K> {
    public INode<K> head;
    public INode<K> tail;

    public MyLinkedList() {

        this.head=null;
        this.tail=null;
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


        public void append(INode<K> myNode)
        {
            if(this.head==null)
            {
                this.head=myNode;
            }
            if(this.tail==null)
            {
                this.tail=myNode;
            }
            else {
                this.tail.setNext(myNode);
                this.tail=myNode;
            }
        }

    public void delete(){

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

    public INode<K> search1(K key) {
        INode<K> tempNode=head;
        while (tempNode!=null && tempNode.getNext()!=null)
        {
            if (tempNode.getKey().equals(key))
            {
                return tempNode;
            }
            tempNode=tempNode.getNext();
        }
        return null;


    }

    @Override
    public String toString() {
        return "MyLinkedListNodes{" + head + "}" ;
    }
}

