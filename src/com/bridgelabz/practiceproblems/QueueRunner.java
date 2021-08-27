package com.bridgelabz.practiceproblems;

import java.util.Scanner;

public class QueueRunner {
    public static void main(String[] args) {

        System.out.print("Enter any string:");
        Scanner in=new Scanner(System.in);
        String inputString = in.nextLine();
        MyQueue myQueue=new MyQueue();
        for (int i = inputString.length()-1; i >=0; i--) {
            char a=inputString.charAt(i);
            MyNode<Character> myFirstNode=new MyNode<>(a);
            myQueue.enqueue(myFirstNode);
        }

        String reverseString = "";

        while (!myQueue.isEmpty()) {
            reverseString = reverseString+myQueue.dequeue();
        }
        if (inputString.equals(reverseString))
            System.out.println("The input String is a palindrome.");
        else
            System.out.println("The input String is not a palindrome.");



    }
}
