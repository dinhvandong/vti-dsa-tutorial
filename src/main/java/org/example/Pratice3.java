package org.example;

import java.util.Arrays;

public class Pratice3 {
    public static void main(String[] args) {


        int array [] ={0,1,2,3,4,5,6,7,8};
        // Dao nguoc cac so le trong mang

        int left = 0;
        int right = array.length - 1;
        while(left<right){
            while(array[left]%2==0){
                left ++;
            }
            while (array[right]%2==0){
                right --;
            }
            int temp = array[left];
            array[left] = array[right];
            array[right]= temp;
            left ++;
            right --;
        }
        for(int x = 0;x< array.length;x++)
        {
            System.out.print(array[x]+ "  ");
        }
    }
}
