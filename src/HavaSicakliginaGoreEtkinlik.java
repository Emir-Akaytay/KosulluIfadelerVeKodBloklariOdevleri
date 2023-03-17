import java.util.Scanner;

public class HavaSicakliginaGoreEtkinlik {
    public static void main(String[] args) {
        int temp;
        Scanner input = new Scanner(System.in);

        System.out.print("Havanın Sıcaklığını (Derece Cinsinden) Giriniz: ");
        temp = input.nextInt();

        if (temp < 5) {
            System.out.println("Kayak Yapınız!!!!");
        } else if (temp <= 15) {
            System.out.println("Sinemaya Gidiniz!!!!");
        } else if (temp <= 25) {
            System.out.println("Pikniğe Gidiniz!!!!");
        } else {
            System.out.println("Yüzmeye Gidiniz!!!!");
        }
    }
}
