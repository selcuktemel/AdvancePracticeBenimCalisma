package projects.okulyonetimii;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Islemler {

    static List<Kisi> ogrenciListesi = new ArrayList<Kisi>();
    static List<Kisi> ogretmenListesi = new ArrayList<Kisi>();
    static Scanner scan = new Scanner(System.in);
    static String kisiTuru;

    public static void girisPaneli() {
        System.out.println("====================================\nOGRENCI VE OGRETMEN YONETIM PANELI\n" +
                "====================================\n"
                + "1- OGRENCI ISLEMLERI\n2- OGRETMEN ISLEMLERI\nQ- CIKIS");
        System.out.print("isleminiz seciniz : ");
        String secim = scan.next().toUpperCase();
        switch (secim) {
            case "1":
                kisiTuru = "OGRENCI";
                islemMenusu();

                break;
            case "2":
                kisiTuru = "OGRETMEN";
                islemMenusu();
                break;
            case "Q":
                cıkıs1();

                break;
            default:
                System.out.println("hatali giris yaptiniz : ");
                girisPaneli();// recursive method call
                break;
        }
    }

    private static void cıkıs1() {
        System.out.println("iyi günler yine bekleriz");

    }

    public static void islemMenusu() {
        System.out.println("Sectiginiz  Kişi turu: " + kisiTuru + " icin  aşağıdaki işlemlerden tercih yapınız.\r\n"
                + "============= İŞLEMLER =============\r\n"
                + "     1-EKLEME\r\n"
                + "     2-ARAMA\r\n"
                + "     3-LİSTELEME\r\n"
                + "     4-SİLME\r\n"
                + "     0-ANA MENU");

        System.out.print("islem tercihinizi giriniz : ");

        int secilenIslem = scan.nextInt();
        switch (secilenIslem) {

            case 1:
                ekle();
                islemMenusu();
                break;
            case 2:
                arama();
                islemMenusu();
                break;
            case 3:
                listele();
                islemMenusu();
                break;
            case 4:
                silme();
                islemMenusu();
                break;
            case 0:
                girisPaneli();
                break;
            default:
                System.out.println("hatali giris yaptiniz ");
                islemMenusu();
        }

    }

    private static void silme() {
        System.out.println("****** " + kisiTuru + " arama sayfasi *******");

        boolean varMi = true;

        if (kisiTuru.equalsIgnoreCase("OGRENCİ")) {

            System.out.print("silinecek ogrennci kimlik Numarasını girini : ");
            String silinenKimlikNo = scan.next();

            for (Kisi each : ogrenciListesi) {
                if (each.getKimlikNo().equals(silinenKimlikNo)) {
                    System.out.println("silinen ogrenci"+ each.getAdSoyad());
                    ogrenciListesi.remove(each);
                    varMi = false;
                }
            }
            if (varMi) {
                System.out.println("Kayit bulunamadi ");
            }

        } else {// ogrentmen araniyor

            System.out.print("silinecek ogretmen kimlik Numarasını giriniz : ");
            String silinecekKimlikNo = scan.next();
            for (Kisi each : ogretmenListesi) {
                if (each.getKimlikNo().equals(silinecekKimlikNo)) {
                    System.out.println("silinen ogretmen" + each.getAdSoyad());
                    ogrenciListesi.remove(each);
                    varMi = false;
                }
            }
            if (varMi) {
                System.out.println("Kayit bulunamadi ");
            }
        }

  
   

    }

    private static void listele() {
        System.out.println("****** " + kisiTuru + " listeleme sayfasi *******");
        if (kisiTuru.equalsIgnoreCase("OGRENCI")) {
            System.out.println(ogrenciListesi);

        } else {
            for (Kisi each : ogretmenListesi) {
                System.out.println(each.toString() + each.getAdSoyad());
            }

        }

    }

    private static void arama() {
        System.out.println("****** " + kisiTuru + " arama sayfasi *******");

        boolean varMi = true;

        if (kisiTuru.equalsIgnoreCase("OGRENCİ")) {

            System.out.print("ogrennci kimlik Numarasını girini : ");
            String arananKimlikNo = scan.next();

            for (Kisi each : ogrenciListesi) {
                if (each.getKimlikNo().equals(arananKimlikNo)) {
                    System.out.println("ARADIGINIZ OGRENCİ : " + each.getAdSoyad());
                    varMi = false;
                }
            }
            if (varMi) {
                System.out.println("Kayit bulunamadi ");
            }

        } else {// ogrentmen araniyor

            System.out.print("ogretmen kimlik Numarasını giriniz : ");
            String arananKimlikNo = scan.next();
            for (Kisi each : ogretmenListesi) {
                if (each.getKimlikNo().equals(arananKimlikNo)) {
                    System.out.println("ARADIGINIZ ogretmen" + each.getAdSoyad());
                    varMi = false;
                }
            }
            if (varMi) {
                System.out.println("Kayit bulunamadi ");
            }
        }
    }

    private static void ekle() {
        System.out.println("****** " + kisiTuru + " ekleme sayfasi *******");
        System.out.print("ad soyad giriniz : ");
        scan.next();//dummy hayalet komut (bos komut)
        String adSoyad = scan.nextLine();
        System.out.print("kimlikNo giriniz : ");
        String kimlikNo = scan.next();
        System.out.print("yas giriniz : ");
        int yas = scan.nextInt();
        if (kisiTuru.equals("OGRENCI")) {
            System.out.print("ogrenci No giriniz : ");
            String ogrenciNo = scan.next();
            scan.nextLine();//dummy hayalet komut (bos komut)
            System.out.print("sınıf giriniz : ");
            String sinif = scan.next();

            Ogrenci ogrenci1 = new Ogrenci(adSoyad, kimlikNo, yas, ogrenciNo, sinif);
            ogrenciListesi.add(ogrenci1);


        } else {
            System.out.print("ogrentmen sicilNo giriniz : ");
            String sicilNo = scan.nextLine();
            scan.next();//dummy hayalet komut (bos komut)
            System.out.print("bolum giriniz : ");

            String bolum = scan.nextLine();
            scan.next();//dummy hayalet komut (bos komut)
            Ogretmen ogretmen1 = new Ogretmen(adSoyad, kimlikNo, yas, sicilNo, bolum);
            ogretmenListesi.add(ogretmen1);

        }


    }

}
