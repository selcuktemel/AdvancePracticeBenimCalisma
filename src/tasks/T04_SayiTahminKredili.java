package tasks;

import java.util.Random;
import java.util.Scanner;

public class T04_SayiTahminKredili {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        /*
         * Sayı tahmin etme oyunu.... Bilgisayardan rastle(random class kullanılarak)
         * 0-100 arasında bir sayı alıp kullanıcının tahminini her defasından
         * büyük-kücük yönlendirerek rastgele sayiyi bulmasını sağlayan kod yazınız.
         *
         * TRICK : Random rnd = new Random();
                   int sayi = rnd.nextInt(101); ===> random
           class'indan random objesini kullanilıyor. Daha sonra 'rnd' obj  ile parametresi sinirini belirleyip
           int sayi variable'a assign edilmeli.
         */
        Random rd = new Random();

        int sayi = rd.nextInt(100);
        System.out.println("bilgisayarin sectigi sayi : " + sayi);

        int tahminisayi = scan.nextInt();
        while (!(tahminisayi == sayi)) {
            if (tahminisayi > sayi) {
                System.out.println("tahminiSayiyi kücültün");
                tahminisayi = scan.nextInt();

            } else if (tahminisayi < sayi) {
                System.out.println("tahminiSayiyi büyütün");
                tahminisayi = scan.nextInt();

            }
        }
        System.out.println("tebrikler bildiniz");

    }
}
