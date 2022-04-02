package projects.P02_javaBankATM;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class AtmMethodlar {
    static Scanner scan = new Scanner(System.in);//Kullaniciya giriş için kart numarasi ve şifresini isteyin
    static int secim;
    static String sifre;
    static List<String> kartList = new ArrayList<>(Arrays.asList("123456789"));
    static List<String> sifreList = new ArrayList<>(Arrays.asList("1111"));
    static List<String> kayitliAlicilar = new ArrayList<>(Arrays.asList("AliCan"));
    static int bakiye = 1000;
    static String kartNo;

    //1-ScannerMethod calıstı kullanıcıdan kart ve sifresi istendi
    static void ScannerMethod() {
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen kart numaranizi giriniz");
        kartNo = scan.nextLine().replaceAll(" ", "");
        System.out.println("lütfen sifreiniz giriniz");
        sifre = scan.next();
    }

    //2- sifre kontrolü ve sifre kontrolü sonrası işlemler yapıldı
    static void IslemleriYap() {
        //a.sifre hatali ise ScannerMethoduna tekrar dönüldü
        if (!(sifreList.contains(sifre) && (kartList.contains(kartNo)))) {
            System.out.println("sifreniz yada kart numaraniz hatali lütfen tekrar giriniz");
            ScannerMethod();
        }
        // b. kart numarasi ve sifre sogru ise yapılacak islemleri çalsıtır ve secim yaptır.
        if (sifreList.get(0).equals(sifre) && kartList.get(0).equals(kartNo)) {
            System.out.println("asagıdaki işlemlerden yapmak istediğinizi seciniz :\n" +
                    "bakiye sorgulama için : 1\n" +
                    "para yatırma icin : 2\n" +
                    "para göndeme icin : 3\n" +
                    "para cekme icin : 4\n" +
                    "sifre degistirmek icin : 5\n" +
                    "cikis icin : 0");
            secim = scan.nextInt();
        }
//c. yapılan secimme göre islemleri yap
        switch (secim) {
            case 1:
                System.out.println("**Bakiyeniz** : " + bakiye);
                cıkıs();// bakiye kontrolü yapıldıktan sonra cıkıs methoduna yonlendir işleme devam edip etmeyeceginni sor
                break;
            case 2:
                System.out.println("lütfen yatirmak istediginiz miktari giriniz");
                int yatirilacakParaMiktari = scan.nextInt();// yatırılacak mikrari kullanicidan al
                bakiye += yatirilacakParaMiktari;//bakiyeye ekle
                System.out.println("**Bakiyeniz** : " + bakiye);
                cıkıs(); //bakiye kontrolü yapıldıktan sonra cıkıs methoduna yonlendir işleme devam edip etmeyeceginni sor
                break;
            case 3:/*Para gönderme işleminde istenen iban TR ile baslamali ve toplam 26 karakterli olmali*/
                System.out.println("lütfen gondermek istediginiz miktari giriniz");
                int gonderilecekkParaMiktari = scan.nextInt();/* gönderilecek para miktarini kullanicidan al*/
                System.out.println("IBAN numaranızı giriniz");
                String ibanNo = scan.next();
                if (ibanNo.length() == 4 && ibanNo.toUpperCase().startsWith("TR")) {/*iban numarasinin uzunlugu 26 olmali ve TR ile baslamali */
                    System.out.println("iban no geçerli ");
                } else {
                    System.out.println("GECERLI BIR IBAN GIRINIZ");
                    IslemleriYap();
                }
                System.out.println("alıcı adını giriniz");
                String aliciAdi = scan.next();
                if (kayitliAlicilar.contains(aliciAdi)) {/*ipara gönderielcek kişiin sistemede kayıtlı olup olmadıgını kontrol etmek icin */
                    System.out.println("alici adi : " + aliciAdi);
                } else {
                    System.out.println("gecerli kullanıcı adı bulunamadi");
                    IslemleriYap();
                }

                if (gonderilecekkParaMiktari > bakiye) {// gönderilecek miktar bakiyeden fazla ise hata bildir menüye dondur.
                    System.out.println(gonderilecekkParaMiktari + " gönderilecek miktar bakiyenizden büyük " +
                            "bakiyenizden daha kücük bir deger giriniz");
                    IslemleriYap();
                } else {
                    bakiye -= gonderilecekkParaMiktari;
                    System.out.println("işleminiz basaiyla gerceklestirildi");
                    System.out.println("**Bakiyeniz** : " + bakiye);
                }
                cıkıs();
                break;
            case 4:
                System.out.println("lütfen cekmek istediginiz miktari giriniz");
                int cekilecekMiktar = scan.nextInt();
                if (cekilecekMiktar > bakiye) {/*Cekilecek miktar bakiyeden fazla ise hata bildir menüye dondur.*/
                    System.out.println(cekilecekMiktar + " Cekilecek miktar bakiyenizden büyük bakiyenizden daha kücük bir deger giriniz");
                    IslemleriYap();
                } else {
                    bakiye -= cekilecekMiktar;
                    System.out.println("işleminiz basaiyla gerceklestirildi");
                    System.out.println("**Bakiyeniz** : " + bakiye);
                }
                cıkıs();
                break;

            case 5:
                System.out.println("lütfen degistrimek istediğiniz sifreyi giriniz");
                sifre = scan.next();// en basta girdigimiz sifresi tekrar istedik
                if (sifre.equals(sifreList.get(0))) {/* sifre listesi icindeyse kontrol ettik eslesiyorsa isleme devam etti */
                    System.out.println("sifreniz eslesmistir.");
                } else {/* eşlesmiyorsa menüden sifre degisikligi icin tekrar secim yaptırdık*/
                    System.out.println("sifreniz eslesmedi lütfen tekrar deneyiniz");
                    IslemleriYap();
                }
                System.out.println("lütfen yeni sifreyi giriniz");
                String yeniSifre = scan.next();// yeni sifreyi girmesisini sagladık
                if (!sifre.equals(yeniSifre)) {// sifre yeni sifre ile eslesmiyorsa,
                    sifreList.add(yeniSifre);//sifreyi sifrelistesine ekledik
                    System.out.println("sifreniz basariyle degistrilmiştir. Yeni sifreiniz : " + yeniSifre + "\n" +
                            "lütfen sifrenizi kimse ile paylasmayiniz.");//yeni sfiresini yazdirdik
                } else {// yeni sifre eskisi ile aynıysa menüye döndürüdük
                    System.out.println("yeni sifreniz eski sifre ile ayni olamaz lütfen tekrar deneyiniz .");
                    IslemleriYap();
                }
                cıkıs();/*cıkıs işlemi icin, her case'ın sonuna cıkıs methodunu ekledik*/
                break;
            case 0:
                System.out.println("isleminiz basariyla gerceklestirilmistir.");
                break;
            default:
                System.out.println("hatali giris yaptiniz");
        }
    }

    private static void cıkıs() {
        System.out.println("isleme devam etmek istiyorsaniz 1'i cıkıs işlemi icin 0'ı tklayınız");
        int secim2 = scan.nextInt();// cıkıs methodunda secim yaptırdık secim 1 ise tekrar yeni bir secim yaptırdık
        if (secim2 == 1) {
            IslemleriYap();

        } else if (secim2 == 0) {// 0 sa cıkısını sağladık
            System.out.println("isleminiz basariyla gerceklestirilmistir.");
        } else {//0 veya 1 girmediyse tekrar cıkısa yönlendirdik
            System.out.println("lütfen 1 yada 0 girin");
            cıkıs();
        }
    }
}
