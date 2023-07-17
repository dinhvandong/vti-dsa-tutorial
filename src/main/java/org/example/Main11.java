package org.example;

import java.util.LinkedList;

public class Main11 {

    public static void main(String[] args) {
        // Creating object of the
        // class linked list
        LinkedList<String> ll = new LinkedList<String>();
        LinkedList<Integer> llIndex = new LinkedList<Integer>();

        String s="Abdas232woeqwew232qewwqeoieuiepqklasd232";
        // S="Abdas232woeqwew232qewwqeoieuiepqklasd232"
        // Find index in String S contain value 232
        for(int i =0;i< s.length();i++)
        {
            String item = s.charAt(i) + "";
            // charAt(i) lay ve ky tu thu i cua String
            // + "" thi convert sang kieu string
            ll.add(item);
        }

        for(int i = 0;i< ll.size()-2;i++){
            if(ll.get(i).equals("2")){
                int k = i;
                if(ll.get(k+1).equals("3"))
                {
                    if(ll.get(k+2).equals("2"))
                    {
                        llIndex.add(k);
                    }
                }
            }
        }

        System.out.println(ll);
        System.out.println(llIndex);
    }
}
