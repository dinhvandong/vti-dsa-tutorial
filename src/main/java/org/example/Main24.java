package org.example;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main24 {
    public static void main(String[] args) {
        // Bài 1
        String s= "Adaabcbdbassnasdmdsalewqewqewqew";
        String s1[] = {"A","d","a"};
        // Sap xep chuoi theo thu tu alphab
        // Bài 2
        int a[] ={1,2,3,4,5,6,7,8};
        int b[] = {8,7,6,5,4,3,2,1};
        // Kiểm tra 2 mang a va b có phải đảo ngược hay không?
        // Bài 3
        // int c[] = a + b
        // Xóa bỏ các giá trị trùng lặp trong mảng C
        String s_array[] = s.split("");
        String result = "";
        Arrays.sort(s_array);
        for(int i =0 ;i< s_array.length;i++)
        {
            System.out.print(s_array[i] + " ");
            result += s_array[i];
        }
        System.out.println();
        System.out.println(result);
    }
}
