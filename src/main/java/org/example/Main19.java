package org.example;

import java.util.HashSet;
import java.util.Set;

public class Main19 {
    public static void main(String[] args) {

        String chuoi = "Aaabbb313213jhdsa";
        Set<String> stringSet1 = new HashSet<>();

        Set<String> stringSet2 = new HashSet<>();

        for(int i = 0;i< chuoi.length();i++)
        {
            String item = chuoi.charAt(i) + "";
            boolean check = stringSet1.add(item);
            if(!check){
                stringSet2.add(item);
            }
        }
        for(String item: stringSet2){
            System.out.println(item);
        }

    }
}
