package org.example;

public class LetCode2 {

    public static void main(String[] args) {
        String s = "4193 with words";
        int value = myAtoi(s);
        System.out.println(value);
    }

    public static  int myAtoi(String s) {
        int startIndex = -1;
        int endIndex = -1;
        for (int i = 0; i < s.length(); i++) {
            if (isNumber(s.charAt(i) + "")) {
                if (startIndex == -1) { // Neu ma startIndex == - 1 co nghia la no chua dc danh dau
                    startIndex = i;
                } else {

                    endIndex = i + 1;
                }
            }
        }
            String result = "";
            try {
                result = s.substring(startIndex, endIndex);

            } catch (Exception e) {

            }
            int value = 0;
            try {
                if (result != null && result != "") {
                    value = Integer.parseInt(result);

                }
            } catch (NumberFormatException e) {
                e.printStackTrace();
                //somehow workout the issue with an improper input. It's up to your business logic.
            }
            String nagativeString = "";
            if (startIndex > 0) {
                nagativeString = s.charAt(startIndex - 1) + "";
            }
            int nagative = (nagativeString.equals("-")) ? -1 : 1;
            return value * nagative;

    }
    static  boolean isNumber(String s){
        if(s.equals("0")
                || s.equals("1")
                || s.equals("2")
                || s.equals("3")
                || s.equals("4")
                || s.equals("5")
                || s.equals("6")
                || s.equals("7")
                || s.equals("8")
                || s.equals("9")){
            return true;
        }
        return false;
    }
}
