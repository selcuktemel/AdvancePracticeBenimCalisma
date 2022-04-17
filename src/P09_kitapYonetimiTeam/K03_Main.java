package P09_kitapYonetimiTeam;

import java.util.Scanner;

import static P09_kitapYonetimiTeam.K01_Yonetimsel_Islemler.girisPaneli;
import static P09_kitapYonetimiTeam.K01_Yonetimsel_Islemler.mevcutKitapListesi;
import static P09_kitapYonetimiTeam.OgrenciIslemleri.ogrenciGirisPaneli;

public class K03_Main {

    public static void main(String[] args) {
        System.out.println("*****JAVA KÜTÜPHANESİNE HOSGELDİNİZ*****");
        System.out.print("Yonetici isleri icin 1\nOgrenci isleri icin 2\nSeciminizi yapiniz : ");
        Scanner scan = new Scanner(System.in);
        int secim = scan.nextInt();
        if (secim == 1) {
            mevcutKitapListesi();// mevcut kitap listesi kodu okumak kolay olsun diye koydum
            girisPaneli();
        } else if (secim == 2) {
            mevcutKitapListesi();// mevcut kitap listesi kodu okumak kolay olsun diye koydum
            ogrenciGirisPaneli();
        }


    }


}