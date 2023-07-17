package org.example;

public class Pratice1 {
    public static void main(String[] args) {
        String template = "Anhbc3123kjhdas123213123#$@#@#$#$##@@#@!#@#@$#";
        String template2 = "";
        // Bai 1 In ra cac ky tu la so dem trong template
        for(int i = 0;i< template.length(); i++)
        {
            if(Character.isDigit(template.charAt(i))){
                char x = template.charAt(i);
                template2 += x + "";
            }
        }
        System.out.println(template2);
    }
    static boolean isNumber(char c){
        if(c=='0') return true;
        if(c=='1') return  true;
        if(c=='2') return  true;
        if(c=='3') return  true;
        if(c=='4') return  true;
        if(c=='5') return  true;
        if(c=='6') return  true;
        if(c=='7') return  true;
        if(c=='8') return  true;
        if(c=='9') return  true;
        return false;
    }
}
