import java.util.Scanner;

public class SinifGecme {
    public static void main(String[] args) {
        double mat, fiz, tur, kim, muz, average;
        Scanner input = new Scanner(System.in);

        System.out.print("Matematik Notunuzu Giriniz: ");
        mat = input.nextDouble();
        System.out.print("Fizik Notunuzu Giriniz: ");
        fiz = input.nextDouble();
        System.out.print("Türkçe Notunuzu Giriniz: ");
        tur = input.nextDouble();
        System.out.print("Kimya Notunuzu Giriniz: ");
        kim = input.nextDouble();
        System.out.print("Müzik Notunuzu Giriniz: ");
        muz = input.nextDouble();

        average = (mat + fiz + tur + kim + muz) / 5;

        if ((0 <= mat && mat <= 100) && (0 <= fiz && fiz <= 100) && (0 <= tur && tur <= 100) && (0 <= kim && kim <= 100) && (0 <= muz && muz <= 100)) {
            if (average < 55)
                System.out.println("Notunuz:"+average+" ===> Sınıfta Kaldınız...");
            else
                System.out.println("Notunuz:"+average+ " ===> Sınıfı Geçtiniz!!!!");

        } else {
            System.out.println("Hatalı Not Girişi Yaptınız.Daha Sonra Tekrar Deneyin...");
        }
    }
}