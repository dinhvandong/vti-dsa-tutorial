package org.example;

import java.util.Stack;

public class LetCode1 {
    public static void main(String[] args) {
            int x = 1034236469;
            int result = reverse(x);
        System.out.println(result);


    }

    public static int reverse(int x) {

       int nagative = (x>=0)? 1: -1;
        Stack<Integer> stack = new Stack<>();
        int x2 = Math.abs(x);
        while(x2>0){
            int d = x2%10;
            x2 = x2/10;
            stack.push(d);
        }
        int count =0;
        String result = "";
        while(!stack.isEmpty()){
            int value = stack.pop() ;
            result = value + result;
        }
        System.out.println(result);
        int value = 0;
        try {
            value = Integer.parseInt(result);
            return value* nagative;
        } catch (NumberFormatException e) {
            e.printStackTrace();
            //somehow workout the issue with an improper input. It's up to your business logic.
        }
        return 0;
    }
}
