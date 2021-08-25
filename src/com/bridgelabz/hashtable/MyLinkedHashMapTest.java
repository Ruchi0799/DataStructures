package com.bridgelabz.hashtable;

import java.util.Locale;

public class MyLinkedHashMapTest {
    public static void main(String[] args) {
        String sentence="Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";
        MyLinkedHashMap<String,Integer> myLinkedHashMap=new MyLinkedHashMap<>();
        String[] words=sentence.toLowerCase(Locale.ROOT).split(" ");
        for (String word:words){
            Integer value=myLinkedHashMap.get(word);
            if (value==null) value=1;
            else value=value+1;
            myLinkedHashMap.add(word,value);
        }
        System.out.println(myLinkedHashMap);
        myLinkedHashMap.remove("avoidable");
        System.out.println("After deleting avoidable");
        System.out.println(myLinkedHashMap);

    }

}