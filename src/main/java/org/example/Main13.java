package org.example;

import java.util.Stack;
public class Main13 {
    public static void main(String[] args) {
        Stack<Long> stack = new Stack<Long>();
        long n = 10000000;
        while (n > 0) {
            long d = n % 2;
            n= n/2;
            stack.push(d);
        }
        String result = "";
        while (!stack.isEmpty()) {
         long   value = stack.pop();
            result = result +  value;
        }
        System.out.println(result);
    }
    boolean gt0(String number){

        return false;
    }
    String d2(String number){
        // lay phan du khi chia 2
        int len = number.length();
        String lastNum = number.charAt(len-1) + "";
        int num = Integer.parseInt(lastNum);
        return num%2 + "";
    }

    String divide2(String number){
        // lay gia tri khi chia 2
        return null;
    }


}
