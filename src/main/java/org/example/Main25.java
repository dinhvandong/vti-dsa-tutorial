package org.example;

import java.util.HashSet;
import java.util.Set;

public class Main25 {
    public static void main(String[] args) {
        // Bài 2
        int a[] ={1,2,3,4,5,6,7,8,234};
        int b[] = {8,7,6,5,4,3,2,1};
        // Kiểm tra 2 mang a va b có phải đảo ngược hay không?
        // Bài 3
        // int c[] = a + b
        // Xóa bỏ các giá trị trùng lặp trong mảng C
        boolean check = checkReverseArray(a, a.length, b, b.length);
        if(check){
            System.out.println("Day la 2 mang doi xung");
        }else{
            System.out.println("Day la 2 mang ko doi xung");
        }
        int lengthC = a.length + b.length;
        int c[] = new int[lengthC];
        for(int i = 0;i<a.length;i++)
        {
            c[i] = a[i];
        }

        for(int j = a.length; j< lengthC;j++)
        {
            c[j] = b[j - a.length];

        }
        System.out.println("Mang C sau khi gop A va B: ");

        for(int i = 0;i< lengthC;i++){
            System.out.print(c[i]+"  ");
        }


        Set<Integer> setList = new HashSet<>();

        for(int i =0;i< lengthC;i++)
        {
            setList.add(c[i]);
        }
        // Sau khi duyet xong mang C thi trong setList chua cac phan tu ko trung lap cua C
        // Cap nhat lai gia tri trong mang C
        int i =0;
        for(Integer integer: setList)
        {
            c[i] = integer.intValue();
            i++;
        }
        lengthC = setList.size();
        System.out.println("\nMang C sau khi remove trung lap: \n");
        for(int j = 0;j< lengthC;j++)
        {
            System.out.print(c[j] + "  ");
        }





    }

    static boolean checkReverseArray( int array1[], int n, int array2[], int m)
    {
        if(n!= m){
            return false;
        }
        // n==m
        int j = n-1;
        for(int i = 0;i<n;i++)
        {
            if(array1[i] != array2[j])
            {
                return false;
            }
            j--;
        }
        return true;
    }
}
