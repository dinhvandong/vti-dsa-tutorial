package org.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Practice5 {
    public static void main(String[] args) {

        String s = "11aaBBcd";

        // Xoa cac phan tu trung lap trong String
        // Out put : 1aBcd
        System.out.println(removeDuplicate3(s));




    }

    public static String removeDuplicate3(String s){
        List<String> stringList = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            String item = String.valueOf(c);
            if(!stringList.contains(item)){
                stringList.add(item);
            }
            // = true add success
        }
        String result = "";
        for(String item: stringList){
            result += item;
        }
        return  result;
    }
    public static String removeDuplicate2(String s){

        Set<String> stringSet = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            boolean checkExist = stringSet.add(c+"");
            // = true add success
        }
        String result = "";
        for(String item: stringSet){
            result += item;
        }
        return  result;
    }
    public static  String removeDuplicate(String s){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (sb.indexOf(String.valueOf(c)) == -1) {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
