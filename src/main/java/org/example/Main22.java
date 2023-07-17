package org.example;

public class Main22 {

    public static void main(String[] args) {


        String temp = "A   n c  123241An  c123213 A123djasd@A   nc321ndsad";

        temp = temp.replace(" ", "");

        // Tim so lan xuat hien ky tu Anc trong chuoi temp

        // Tim chuoi ky tu (substring) lap lai dài nhất trong chuoi temp


        int count = 0;
        for(int i =0;i< temp.length(); i++)
        {
            char item = temp.charAt(i) ;
            if(item=='A'){
                int index = i;
                if(temp.charAt(index+1)=='n')
                {
                    if(temp.charAt(index+2) =='c'){
                        count = count + 1;
                    }
                }
            }
        }
        System.out.println("So lan xuat hien Anc:"+ count);




    }
}
