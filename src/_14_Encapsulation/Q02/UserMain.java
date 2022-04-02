package _14_Encapsulation.Q02;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class UserMain {
    static Scanner scan = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {

        User user1 = new User();// birinci kullanıcı objesi

        User user2 = new User();// ikinci kullanıcı objesi

        System.out.println("1 inci kullanıcı adını ve sifresini giriniz");
        user1.username = scan.next();// kullanıcıdan user1 iinci kullanıcı adı aldık
        user1.setPassword(scan.next());//*** yine kullancııdan user1 icin sifre istedik ama bunu POJO classında bulununa
                                      // getter ve setter methotlarını kullnarak aldık neden?
                                      // cunku urettigimiz objedeki constructorlara girdigimiz parametreleri eger
                                      // bir methoda göndermezsek ve methodCall yapmazsak (methoddan cagırmazsak) CAPSULE ETMİS OLMAYİZ
                                      // burada kullacının girdigi hataların onüne geçmek icin ve sifrede bizim belirlediğimiz
                                     // uzunluktan daha dusuk bir deger girmesini onlemek icin setPassword içinde kosul olusturduk.

        user1.ıd = random.nextInt(100);

        System.out.println("2 nci kullanıcı adını ve sifresini giriniz");
        user2.username = scan.next();
        user2.setPassword(scan.next());//*** aynısı
        user2.ıd = random.nextInt(200);

        List<String> liste = new ArrayList<String>();
        liste.add(user1.username);
        liste.add(user1.getPassword());

        liste.add(user2.username);
        liste.add(user2.getPassword());
        System.out.println("kullanıcı isimleri ve sifreler"+ liste);
        System.out.println("birinci kullanıcının bilgileri : "+ user1);
        System.out.println("ikinci kullanıcının bilgileri : "+ user2);


    }

}
