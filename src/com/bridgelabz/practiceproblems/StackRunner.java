package com.bridgelabz.practiceproblems;




public class StackRunner {


    public static String  checkBalance(String str) {
        MyStack myStack=new MyStack();
        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            MyNode<Character> myFirstNode=new MyNode<>(ch);

            if (ch == '[' || ch == '(' || ch == '{') {
                myStack.push(myFirstNode);
            } else if ((ch == ']' || ch == '}' || ch == ')')
                    && (!myStack.isEmpty())) {
                if (((char) myStack.peek() == '(' && ch == ')')
                        || ((char) myStack.peek() == '{' && ch == '}')
                        || ((char) myStack.peek() == '[' && ch == ']')) {
                    myStack.pop();
                } else {
                    return "Not Balanced";
                }
            } else {
                if ((ch == ']' || ch == '}' || ch == ')')) {
                    return "Not Balanced";
                }
            }

        }

        if (myStack.isEmpty())
            return "Balanced Parenthisis";
        else
            return "Not Balanced";

    }

    public static void main(String[] args) {

        String str = "(5+6)∗(7+8)/(4+3)(5+6)∗(7+8)/(4+3)";


        System.out.println(StackRunner.checkBalance(str));

    }

}
