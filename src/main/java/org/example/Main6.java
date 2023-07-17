package org.example;

public class Main6 {

    public static void main(String[] args) {

        int array[] = {1,3,5,7,8,9,9,21,12,321,12,312,321,321,321,1,2,3};
        // viet dao nguoc cac phan tu cua array
        // reverse array
        int len = array.length;
        // Khai bao array 2 luu tru mang template
        int array2[] = new int[len];
        int j = 0;
        for(int i = len-1;i >=0 ;i--)
        {
            array2[j] = array[i];
            j++;
        }
        for(int i = 0;i<len;i++)
        {
            array[i] = array2[i];
        }
        System.out.println("Array Reverse:");
        for(int i = 0;i< len; i++)
        {
            System.out.println(array[i]);
        }


    }
}
