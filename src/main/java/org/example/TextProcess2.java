package org.example;

public class TextProcess2 {
    public static void main(String[] args) {
        // BT1 Xoa khoang trang cua String ko su dung ham Replace
        String temp = "Hom nay la ngay dau tien di hoc          \n " +
                "tai truong trung hoc pho thong Nguyen Trai";
        System.out.println(removeSpace(temp));
    }
    static String removeSpace(String s){
        String trimmedStr = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                trimmedStr += s.charAt(i);
            }
        }
        return trimmedStr;
    }
}
