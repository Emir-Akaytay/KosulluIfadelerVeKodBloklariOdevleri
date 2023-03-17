import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        double n1, n2;
        int op;

        Scanner input= new Scanner(System.in);

        System.out.println("UYARI:BU HESAP MAKİNESİ SADECE İKİ(2) SAYIYLA İŞLEM YAPMA OLANAĞI SAĞLAR !!!");
        System.out.println("İLK ÖNCE SAYILARI YAZINIZ,ARDINDAN İŞLEMLER EKRANI KARŞINIZA GELECEKTİR.");

        System.out.print("\nBirinci Sayıyı Giriniz: ");
        n1 = input.nextDouble();
        System.out.print("İkinci Sayıyı Giriniz: ");
        n2 = input.nextDouble();

        System.out.println("\n İşlemlerin Numaraları: \n1-Toplama\n2-Çıkarma\n3-Çarmpma\n4-Bölme");
        System.out.println("\nSayılarınız: "+n1+" ve "+n2);
        System.out.print("Yapmak İstediğiniz İşlemi Seçiniz: ");
        op = input.nextInt();


        switch (op) {
            case 1 -> System.out.println("\nSONUÇ: " + (n1 + n2));
            case 2 -> System.out.println("\nSONUÇ: " + (n1 - n2));
            case 3 -> System.out.println("\nSONUÇ: " + (n1 * n2));
            case 4 -> {
                if (n2 != 0) {
                    System.out.println("\nSONUÇ: " + (n1 / n2));
                } else {
                    System.out.println("\n0 BELİRSİZLİĞİ !!! LÜTFEN BAŞKA SAYILAR GİRİNİZ.");
                }
            }
            default -> System.out.println("\nHATA:LÜTFEN NUMARALANDIRILMIŞ İŞLEMLERDEN BİRİNİ GİRİNİZ !!!");
        }
    }
}