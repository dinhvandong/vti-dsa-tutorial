package org.example;

import java.util.Stack;

public class Practice8 {
    public static void main(String[] args) {

        int n = 10;
        // Chuyen doi thap phan sang nhi phan
        // output: 1010 = 2^2 + +0 + 2^1  + 0
        // 0 1 0 1 => 1010
        System.out.println(decimalToBinary(n));

    }
//    public static String decimalToBinary(int decimal) {
//        if (decimal == 0) {
//            return "0";
//        }
//        StringBuilder binary = new StringBuilder();
//        while (decimal > 0) {
//            int rem = decimal % 2;
//            binary.insert(0, rem);
//            decimal /= 2;
//        }
//        return binary.toString();
//    }
    public static String decimalToBinary(int decimal) {
        if (decimal == 0) {
            return "0";
        }
        Stack<Integer> stack = new Stack<>();
        while (decimal > 0) {
            int rem = decimal % 2;
            stack.push(rem);
            decimal /= 2;
        }
        StringBuilder binary = new StringBuilder();
        while (!stack.isEmpty()) {
            binary.append(stack.pop());
        }
        return binary.toString();
    }
}
