package org.example;

public class Main4 {

    // Tim cac so nguyen to trong khoang (a, b) voi a, b nhap vao tu ban phim
    public static void main(String[] args) {

        int a = 10;
        int b = 100;
        int count = 0;

        for(int i = a +1 ;i<b; i++){
            boolean check = checkSNT(i);
            if(check == true){
                    count ++;
                System.out.println(i);
            }
        }
        System.out.println(count);



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
