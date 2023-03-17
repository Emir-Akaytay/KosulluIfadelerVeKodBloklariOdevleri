import java.util.Scanner;

public class BurcBulma {
    public static void main(String[] args) {
        int day, month;
        Scanner input = new Scanner(System.in);

        System.out.println("Doğduğunuz Gün: ");
        day = input.nextInt();
        System.out.print("Doğduğunuz Ay: ");
        month = input.nextInt();

        if ((1 <= month) && (month <= 12)) {

            if (month == 1) {
                if ((1 <= day) && (day <= 31)) {
                    if (day <= 21)
                        System.out.print("Burcunuz:OĞLAK");
                    else
                        System.out.print("Burcunuz:KOVA");
                } else
                    System.out.println("Hatalı Giriş Yaptınız...");

            } else if (month == 2) {
                if ((1 <= day) && (day <= 28)) {
                    if (day <= 19)
                        System.out.print("Burcunuz:KOVA");
                    else
                        System.out.print("Burcunuz:BALIK");
                } else
                    System.out.println("Hatalı Giriş Yaptınız...");

            } else if (month == 3) {
                if ((1 <= day) && (day <= 31)) {
                    if (day <= 20)
                        System.out.print("Burcunuz:BALIK");
                    else
                        System.out.print("Burcunuz:KOÇ");
                } else
                    System.out.println("Hatalı Giriş Yaptınız...");

            } else if (month == 4) {
                if ((1 <= day) && (day <= 30)) {
                    if (day <= 20)
                        System.out.print("Burcunuz:KOÇ");
                    else
                        System.out.print("Burcunuz:BOĞA");
                } else
                    System.out.println("Hatalı Giriş Yaptınız...");

            } else if (month == 5) {
                if ((1 <= day) && (day <= 31)) {
                    if (day <= 21)
                        System.out.print("Burcunuz:BOĞA");
                    else
                        System.out.print("Burcunuz:İKİZLER");
                } else
                    System.out.println("Hatalı Giriş Yaptınız...");

            } else if (month == 6) {
                if ((1 <= day) && (day <= 30)) {
                    if (day <= 22)
                        System.out.println("Burcunuz:İKİZLER");
                    else
                        System.out.println("Burcunuz:YENGEÇ");
                } else
                    System.out.println("Hatalı Giriş Yaptınız...");

            } else if (month == 7) {
                if ((1 <= day) && (day <= 31)) {
                    if (day <= 22)
                        System.out.print("Burcunuz:YENGEÇ");
                    else
                        System.out.print("Burcunuz:ASLAN");
                } else
                    System.out.println("Hatalı Giriş Yaptınız...");

            } else if (month == 8) {
                if ((1 <= day) && (day <= 31)) {
                    if (day <= 22)
                        System.out.println("Burcunuz:ASLAN");
                    else
                        System.out.println("Burcunuz:BAŞAK");
                } else
                    System.out.println("Hatalı Giriş Yaptınız...");

            } else if (month == 9) {
                if ((1 <= day) && (day <= 30)) {
                    if (day <= 22)
                        System.out.println("Burcunuz:BAŞAK");
                    else
                        System.out.println("Burcunuz:TERAZİ");
                } else
                    System.out.println("Hatalı Giriş Yaptınız...");

            } else if (month == 10) {
                if ((1 <= day) && (day <= 31)) {
                    if (day <= 22)
                        System.out.println("Burcunuz:TERAZİ");
                    else
                        System.out.println("Burcunuz:AKREP");
                } else
                    System.out.println("Hatalı Giriş Yaptınız...");


            } else if (month == 11) {
                if ((1 <= day) && (day <= 30)) {
                    if (day <= 22)
                        System.out.println("Burcunuz:AKREP");
                    else
                        System.out.println("Burcunuz:YAY");
                } else
                    System.out.println("Hatalı Giriş Yaptınız...");

            } else {
                if ((1 <= day) && (day <= 31)) {
                    if (day <= 22)
                        System.out.println("Burcunuz:YAY");
                    else
                        System.out.println("Burcunuz:OĞLAK");
                } else
                    System.out.println("Hatalı Giriş Yaptınız...");
            }

        } else
            System.out.println("Hatalı Giriş Yaptınız...");
    }
}
