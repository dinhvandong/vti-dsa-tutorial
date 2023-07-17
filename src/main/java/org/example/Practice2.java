package org.example;

public class Practice2 {
    public static void main(String[] args) {

        String template = "1AY123213H890HHH";
        String [] arrayTemplate = template.split("");
        int left = 0;
        int right = arrayTemplate.length - 1;
        while(left< right){
            while(!isNumber(arrayTemplate[left])){
                left++;
            }
            while(!isNumber(arrayTemplate[right])){
                right --;
            }
            String c = arrayTemplate[left];
            arrayTemplate[left] = arrayTemplate[right];
            arrayTemplate[right] = c;
            left ++;
            right --;
        }
        String result = "";
        for(int k = 0;k< arrayTemplate.length;k++)
        {
            result += arrayTemplate[k];
        }
        System.out.println(result);
    }

    static boolean isNumber(String c){
        if(c.equals("0")) return true;
        if(c.equals("1")) return true;
        if(c.equals("2")) return true;
        if(c.equals("3")) return true;
        if(c.equals("4")) return true;
        if(c.equals("5")) return true;
        if(c.equals("6")) return true;
        if(c.equals("7")) return true;
        if(c.equals("8")) return true;
        if(c.equals("9")) return true;
        return false;
    }
}
