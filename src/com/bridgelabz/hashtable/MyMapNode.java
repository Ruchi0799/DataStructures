package com.bridgelabz.hashtable;

public class MyMapNode<K,V> implements INode<K> {
    K key;
    V value;
    MyMapNode<K, V> next;

    public MyMapNode(K key, V value) {
        this.key = key;
        this.value = value;
        next = null;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return this.value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public INode<K> getNext() {
        return next;
    }

    @Override
    public void setNext(INode next) {
        this.next = (MyMapNode<K, V>) next;
    }

    @Override
    public String toString() {
        StringBuffer myMapNodeString = new StringBuffer();
        myMapNodeString.append("MyMapNode={K=").append(key).append(",V=").append(value).append("}");
        if (next != null) {
            myMapNodeString.append("->").append(next);
        }
        return myMapNodeString.toString();
    }




}

