package org.example;

public class Main23 {
    public static void main(String[] args) {


        int num = 1232421432; // length = 10 1232321430 + 2

        // Tim so luong so cua num voi num la nhap vao tu ban phim

        // In ra cac so hang don vi, tram , chuc, ngan,......

        int count = 0;
        while (num>0){
            int d = num%10; // d = 2
            num = num/10;
            count++;
            System.out.print(" "+ d);
        }
        System.out.println("Co tong cong so chu so:"+ count);
    }
}
