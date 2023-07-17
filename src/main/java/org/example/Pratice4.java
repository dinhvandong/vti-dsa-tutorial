package org.example;

public class Pratice4 {
    public static void main(String[] args) {
        // Tach chuoi sau thanh cac array string chua 2 ky tu,
        // neu le ky tu cuoi cung thi them so 0 phia truoc

        String numberList = "030921";
        // Example 03,09,21
        String numberList2 = "1030921";
        // Example 10,30,92,01

        String result[] = getArray(numberList2);
        for(String s : result){
            System.out.print(s + "   ");
        }
    }

    public static  String[] getArray(String temp){

        int count = 0;
        String tempNew = "";
        String result[] = new String[temp.length()/2];
        for(int i = 0;i< temp.length();i++)
        {

            if(i%2==0 &&i>0){
                tempNew += " " + temp.charAt(i)+"";;
            }else {
                tempNew += temp.charAt(i)+"";
            }

        }
        result = tempNew.split(" ");
        for(int i =0;i< result.length;i++)
        {
            if(result[i].length()==1){
                result[i] = "0"+ result[i];
            }
        }
        return result;
    }
}
