package org.example;

import java.util.Stack;

public class Main16 {

    public static void main(String[] args) {

        int array[] = {1,3,4,5,6,78,8,9,90,0,0,45,23,23,213,23,32,324,324,324,3};

        Stack<Integer> stack = new Stack<>();

        for(int i = 0;i< array.length;i++)
        {
            stack.push(array[i]);
        }

        for(int i = 0;i< array.length;i++)
        {
            array[i] = stack.pop();
        }

        for(int i = 0;i<array.length;i++)
        {
            System.out.println(array[i]);
        }
    }
}
