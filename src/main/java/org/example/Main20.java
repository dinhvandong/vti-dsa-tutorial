package org.example;

public class Main20 {
    public static void main(String[] args) {

        int array[] = {1,5,2,3,4,5,5,4,3,2,1};
        // Kiem tra mang co doi xung hay khong????
        String chuoi = "AbccbA";
        // Kiem tra chuoi co doi xung hay khong??
        int j = array.length-1;
        boolean check = true;
        for(int i = 0;i< array.length/2;i++){

            if(array[i] != array[j]){
                 check = false;
                 // Ky thuat dat co bao hieu
            }
            j--;
        }
        if(!check){
            System.out.println("Mang khong doi xung");
        }else {
            System.out.println("Mang doi xung");
        }

    }
}
