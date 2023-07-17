package org.example;

public class Main7 {
    public static void main(String[] args) {

        int array[] = {1,3,5,7,8,9,9,21,12,321,12,312,321,321,321,1,2,3};
        int len = array.length;
        int j = len - 1;
        for(int i = 0;i< len/2 ; i ++){
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            j--;
        }
        System.out.println("Reverse array:");
        for(int i = 0;i< len;i++)
        {
            System.out.println(array[i]);
        }
    }
}
