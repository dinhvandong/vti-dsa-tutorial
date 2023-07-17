package org.example;

public class MaxNum {
    public static void main(String[] args) {
        //Q #16) Write a Java Program to find the second-highest number in an array.
        // Timf phan tu lon thu 2 cua array
         int array[] = {1,2,321,12,4311,421,31,1,132,213,132,1342141};
         int max1 = array[0];
         int max2 = array[0];
         for(int i=0;i < array.length;i++){
             if (array[i] > max1) { max1 = array[i];
             }
         }
        System.out.println(max1);
        for(int i=0;i < array.length;i++){
            if (array[i] > max2 && array[i] != max1 ) { max2 = array[i];
            }
        }
        System.out.println(max2);

    }

}
