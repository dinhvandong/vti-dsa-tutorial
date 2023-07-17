package org.example;

public class Main3 {


    // Tim 100 so nguyen to dau tien
    public static void main(String[] args) {

        int count =0; // dem so luong so nguyen to
        int i = 2;
        while(count<100){
            boolean check = checkSNT(i);
            if(check==true ){
                System.out.println(i);
                count ++;
            }
            i++;
        }
    }

    static boolean checkSNT(int a){
        /// a la SNT thi return true
        // a khong la SNT return false
        if(a<2){
            return false; // nho hon 2 chac chan khong phai la so nguyen to
        }
        int count = 0;
        for(int i = 1;i<=a;i ++){
            if(a%i ==0){
                count ++;
            }
        }
        if(count ==2 ){
            return true;
        }
        return false;
    }



}
