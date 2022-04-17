package tasks;

public class T06_PermutasyonKombinasyon {
    /*  Problem Tanımı
            Verilen iki sayının kombinasyonunu bulan kodu yazınız.
            Hatırlatma C(n,r) = n! / (r!(n-r)!)

            Verilen iki sayının permütasyonunu bulan kodu yazınız.
            Hatırlatma P(n,r) = n! / (n-r)!

            Ekran Çıktısı
            Birinci sayıyı giriniz: 15
            Ikinci sayıyı giriniz: 4
            Kombinasyon: 1365
            permütasyon: 32760

            Birinci sayıyı giriniz: 5
            Ikinci sayıyı giriniz: 3
            Kombinasyon: 10
            permütasyon: 60
          */
    public static void main(String[] args) {

        long n1 = 15;
        long r1 = 4;

        long n = 1;
        for (int i = 1; i <= n1; i++) {
            n *= i;
        }
        System.out.println("n!= " + n);

        long r = 1;
        for (int i = 1; i <= r1; i++) {
            r *= i;
        }
        System.out.println("r! = " + r);

        long n_r = 1;
        for (int i = 1; i <= (n1 - r1); i++) {
            n_r *= i;
        }
        System.out.println("(n_r)!= " + n_r);

        //Combinaston =C(n,r) = n! / (r!(n-r)!)
        System.out.println("C(" + n1 + "," + r1 + ") = " + ((n / (r * (n_r)))));
        //P(n,r) = n! / (n-r)!
        System.out.println("P(" + n1 + "," + r1 + ") = " + ((n / (n_r))));


    }
}
