import java.util.Scanner;

public class UcakBiletiFiyatiHesaplama {
    public static void main(String[] args) {

        int age, tripType;
        double km, normalPrice,discount,discountedAmount,discountedPrice,returnPrice,returnDiscount = 0.20;
        Scanner input = new Scanner(System.in);

        System.out.print("Yaşınızı Giriniz: ");
        age = input.nextInt();
        System.out.print("Gideceğiniz Mesafe(Kilometre Cinsinden): ");
        km = input.nextDouble();
        System.out.println("\nSADECE GİDİŞ İÇİN:1\nGİDİŞ-DÖNÜŞ İÇİN:2 ");
        System.out.print("Yolculuk Tipiniz: ");
        tripType = input.nextInt();

        normalPrice = km * 0.10;

        if ( tripType == 1 ) {
            if ( 0 < km && 0 <= age  &&  age <= 100  ) {
                if ( age < 12 ) {
                    discount = 0.50 ;
                    discountedAmount = normalPrice * discount;
                    discountedPrice = normalPrice - discountedAmount;
                    System.out.println("\nTUTAR: " + discountedPrice + " TL" );
                } else if ( age <= 24 ) {
                    discount = 0.10;
                    discountedAmount = normalPrice * discount;
                    discountedPrice = normalPrice - discountedAmount;
                    System.out.println("\nTUTAR: " + discountedPrice + " TL" );
                } else if ( age < 65 ) {
                    System.out.println("\nTUTAR: " + normalPrice + " TL");
                } else  {
                    discount = 0.30;
                    discountedAmount = normalPrice * discount;
                    discountedPrice = normalPrice - discountedAmount;
                    System.out.println("\nTUTAR: " + discountedPrice + " TL");
                }
            } else {
                System.out.println("\nHATALI GİRİŞ YAPTINIZ");
            }

        } else if ( tripType == 2 ) {
            if ( 0 < km && 0 <= age && age <= 100 ) {
                if (age < 12) {
                    discount = 0.50;
                    discountedAmount = normalPrice * discount;
                    discountedPrice = normalPrice - discountedAmount;
                    returnPrice = 2 * ( discountedPrice - ( discountedPrice * returnDiscount ) );
                    System.out.println("\nTUTAR: " + returnPrice );
                } else if ( age <= 24 ) {
                    discount = 0.30;
                    discountedAmount = normalPrice * discount;
                    discountedPrice = normalPrice - discountedAmount;
                    returnPrice = 2 * ( discountedPrice - ( discountedPrice * returnDiscount ) );
                    System.out.println("\nTUTAR: " + returnPrice + " TL");
                } else if ( age < 65 ) {
                    returnPrice = 2 * ( normalPrice - ( normalPrice*returnDiscount ) );
                    System.out.println("\nTUTAR: " + returnPrice + " TL" );
                }else {
                    discount = 0.30;
                    discountedAmount = normalPrice * discount;
                    discountedPrice = normalPrice - discountedAmount;
                    returnPrice = 2 * ( discountedPrice - ( discountedPrice * returnDiscount ) );
                    System.out.println("\nTUTAR: " + returnPrice + " TL");
                }

            } else {
                System.out.println("\nHATALI GİRİŞ YAPTINIZ");
            }

        } else {
            System.out.println("\nHATALI GİRİŞ YAPTINIZ");
        }
    }
}
