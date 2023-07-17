package org.example;

import java.util.Stack;

public class Main12 {
    public static void main(String[] args) {
        Stack<Integer> stack =
                new Stack<Integer>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        while(!stack.isEmpty()){
            int value = stack.pop();
            System.out.println(value);
        }
    }
}
