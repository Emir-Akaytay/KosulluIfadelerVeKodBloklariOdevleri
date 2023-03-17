import java.util.Scanner;

public class KucukBuyukSiralama {
    public static void main(String[] args) {
        double a,b,c;
        Scanner input = new Scanner(System.in);

        System.out.print("1. Sayıyı Giriniz(a): ");
        a = input.nextDouble();
        System.out.print("2. Sayıyı Giriniz(b): ");
        b = input.nextDouble();
        System.out.print("3. Sayıyı Giriniz(c): ");
        c = input.nextDouble();

        if ( (a > b) && (a > c) ) {
            if (b > c) {
                System.out.println("a > b > c");
            } else {
                System.out.println("a > c > b");
            }
        } else if ( (b > a) && (b > c)) {
            if (a > c) {
                System.out.println("b > a > c");
            } else {
                System.out.println("b > c > a");
            }
        } else if ( (c > a) && (c > b) ) {
            if (b > a) {
                System.out.println("c > b > a");
            } else {
                System.out.println("c > a > b");
            }
        }
    }
}
