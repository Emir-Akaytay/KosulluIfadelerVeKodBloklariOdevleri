import java.util.Scanner;

public class CinZodyagi {
    public static void main(String[] args) {
        int bornDate,remainder;
        Scanner input = new Scanner(System.in);

        System.out.print("Doğum Tarihinizi Giriniz: ");
        bornDate = input.nextInt();

        remainder = bornDate % 12 ;

        switch (remainder) {
            case 0 -> System.out.print("Zodyağınız:MAYMUN");
            case 1 -> System.out.println("Zodyağınız:HOROZ");
            case 2 -> System.out.println("Zodyağınız:KÖPEK");
            case 3 -> System.out.println("Zodyağınız:DOMUZ");
            case 4 -> System.out.println("Zodyağınız:FARE");
            case 5 -> System.out.println("Zodyağınız:ÖKÜZ");
            case 6 -> System.out.println("Zodyağınız:KAPLAN");
            case 7 -> System.out.println("Zodyağınız:TAVŞAN");
            case 8 -> System.out.println("Zodyağınız:EJDERHA");
            case 9 -> System.out.println("Zodyağınız:YILAN");
            case 10 -> System.out.println("Zodyağınız:AT");
            case 11 -> System.out.println("Zodyağınız:KOYUN");
        }
    }
}
