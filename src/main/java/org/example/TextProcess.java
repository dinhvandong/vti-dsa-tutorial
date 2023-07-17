package org.example;

public class TextProcess {

    public static void main(String[] args) {
        String template = "Nguyen Ngoc Anh";// First + Mid + Last
        String array[] = subString1(template);
//        for (int i=0;i<array.length;i++){
//            System.out.println(array[i]);
//        }
//        for(String item: array)
//        {
//            System.out.println(item);
//        }

        // Bai 1. Tach ra thanh array [ First, Mid, Last]
        String template2 = "Since July 2022, we have been supporting " +
                "Codeforces as a title sponsor." +
                " This round is another way for us to " +
                "contribute to the development of the community.";
        String array2[]= subString2(template2);
        System.out.println(subString2(template2));

        for (String w: array2){
            System.out.println(w);
        }
        // Bai 2. Lay cac khong chua ky tu A,a
    }
    // Function here
     static String[] subString1(String s){
        return s.split(" ");
    }

    static String[] subString2(String s){
        String[] words = s.split(" ");
        String result = null;
        for (String w: words){
            if (!(w.contains("a")||w.contains("A"))){
                result = result + w + " ";
            }
        }
        return result.split(" ");
    }
}
