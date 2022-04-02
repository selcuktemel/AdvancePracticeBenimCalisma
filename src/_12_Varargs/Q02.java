package _12_Varargs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q02 {
    public static void main(String[] args) {
        // verilen int lerden ilki haric tum sayilari toplayan ve
        // buldugunuz toplam ile ilk sayiyi carpip sonucu yazdiriniz.

        int sayi1 = 3;
        int sayi2 = 7;
        int sayi3 = 6;
        int sayi4 = 5;

topla(sayi1,sayi2,sayi3,sayi4);
    }

    private static void topla(int sayi1, int...yeni) {
    int toplam=0;

        for (int each:yeni){
        toplam+=each;
    }
        System.out.println("toplam "+toplam);
        System.out.println("carpim " + sayi1*toplam);
    }


}
