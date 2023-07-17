package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int array1 [] = {1,2,3,4,5,6,7,8,9,10};

        int n = array1.length; // Lay ve kich thuoc cua array

        // Do array danh dau muc luc bat dau tu 0 -> do vay 0....n-1
        for(int i =0;i<n;i++){

            if(array1[i] % 2 == 0){

                System.out.println(array1[i]);

            }
        }

    }
}