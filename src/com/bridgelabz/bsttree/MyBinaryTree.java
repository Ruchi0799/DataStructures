package com.bridgelabz.bsttree;

public class MyBinaryTree<K extends Comparable<K>> {
    private MyBinaryNode<K> root;

    public void add(K key){
        this.root=this.addRecursively(root,key);
    }



    private MyBinaryNode<K> addRecursively(MyBinaryNode<K> current,K key)
    {
        if (current==null)
            return new MyBinaryNode<>(key);
        int compareResult=key.compareTo(current.key);
        if (compareResult==0) return current;
        if (compareResult<0) {
            current.left = addRecursively(current.left, key);
        }
        else {
            current.right=addRecursively(current.right,key);
        }
        return current;
    }

   public int getSize(){
        return this.getSizeRecursive(root);
   }

   private int getSizeRecursive(MyBinaryNode<K> current){
        return current==null?0:1+this.getSizeRecursive(current.left)+this.getSizeRecursive(current.right);
   }

   public void search(K key){
       boolean value=this.contains(root,key);
       System.out.println(value);
       //isMember(root,key);
   }
/*
    public boolean isMember (MyBinaryNode<K> current,K key) {
        if(current == null) return false;
        System.out.println(current.key.compareTo(key));

        if (current.key.compareTo(key) == 0) {
            return true;
        } else if (current.key.compareTo(key) < 0) {
            isMember(current.right, key);
        } else {
            isMember(current.left, key);
        }
        return false;
    } */

    private boolean contains(MyBinaryNode<K> current,K key)
    {
        // if the root is null, then either the binary search tree is empty or the value has
        // not been found and traversal cannot continue
        if (current == null)
        {
            return false;
        }
        // if the data being searched for is less than the value of the current root's data,
        // check if the data exists in the current root's left sub-tree
        else if (key.compareTo(current.key) < 0)
        {
            return contains(current.left, key);
        }
        // if the data being searched for is greater than the value of the current root's data,
        // check if the data exists in the current root's right sub-tree
        else if (key.compareTo(current.key) > 0)
        {
            return contains(current.right, key);
        }
        // if the data being searched for is equal to the value of the current root's data, then
        // the search was successful and the method should return true
        else
        {
            return true;
        }
    }

    @Override
    public String toString() {
        return "MyBinaryTree{" +
                "root=" + root +
                '}';
    }
}
