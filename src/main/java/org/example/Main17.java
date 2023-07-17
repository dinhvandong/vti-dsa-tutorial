package org.example;

import java.util.*;

public class Main17 {

    public static void main(String[] args) {
        int array[] = {1,1,2,2,2,2,2,3,3,4,4,4,4,4,4,6,7,8,9,5,5,5};
       // List<Integer> integerList = new ArrayList<>();
        Set<Integer> integerSet = new HashSet<>();
        Set<Integer> integerSet2 = new HashSet<>();
        // Set trong Java , C++, C#,PYthon ,... la 1 Data Structure chua gia tri ko trung lap
        for(int i = 0;i< array.length;i++)
        {
            boolean check = integerSet.add(array[i]);
            // check == true them duoc vao Set co nghia la trong Set chua co phan tu do
            // check == false ko them ptu vao Set co nghia la trong Set da ton tai roi
            if(!check){
                integerSet2.add(array[i]);
            }
        }
        for(Integer integer: integerSet2){
            System.out.println("Dupplicated:"+ integer);
        }
        int i =0;
        for(Integer integer: integerSet){
            array[i] = integer.intValue();
            i++;
        }
        for(int j = 0;j< integerSet.size();j++)
        {
            System.out.println(array[j]);
        }


    }
}
