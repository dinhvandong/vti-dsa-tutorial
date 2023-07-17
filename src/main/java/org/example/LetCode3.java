package org.example;

public class LetCode3 {

    public static void main(String[] args) {
        int x=121;
        System.out.println(isPalindrome(x));
        //
    }
    public static boolean isPalindrome(int x) {
        //121  true
        //123 false
        String s = x + "";
        int j = s.length() - 1;
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            j--;
        }
        return true;
    }

}
