package _12_Varargs;

import java.util.Arrays;

public class Q01 {
    public static void main(String[] args) {
        //  verilen Stringleri birlestiren concat isimli bir method olusturunuz
        // input : "m", "e", "r", "v", "e";
        // output : merve
        String merve[] = {"m", "e", "r", "v", "e"};

        ekleGel(merve);
    }

    private static void ekleGel(String... s) {
        String sonuc = "";
        for (String each : s) {
            sonuc += each;
        }
        System.out.println(sonuc);
    }


}

