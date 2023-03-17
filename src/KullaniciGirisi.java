import java.util.Scanner;
public class KullaniciGirisi {
    public static void main(String[] args) {

        String userName, password, nPassword;
        int approvalStatus;

        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı Adınızı Giriniz: ");
        userName = input.nextLine();
        System.out.print("Şifrenizi Giriniz: ");
        password = input.nextLine();

        if (userName.equals("Java") && password.equals("12345")) {
            System.out.println("Kullanıcı Bigileriniz Doğru!!!!!!");
            System.out.println("Sisteme Giriş Yapılıyor...");

        } else if (!userName.equals("Java")) {
            System.out.println("Kayıtlı Kullanıcı Bulunamadı...");

        } else {
            System.out.println("Şifrenizi Yanlış Girdiniz!!!");
            System.out.print("Şifrenizi Değiştirmek İster Misiniz ??? (EVET:1 , HAYIR:0) : ");
            approvalStatus = input.nextInt();
            if (approvalStatus == 1) {
                System.out.print("Yeni Şifrenizi Giriniz: ");
                Scanner input1 = new Scanner(System.in);
                nPassword = input1.nextLine();
                if (nPassword.equals("12345")) {
                    System.out.println("Eski Şifreniz ile Yeni Şifreniz Aynı Olamaz. Lütfen Daha Sonra Tekrar Deneyiniz...");
                    System.out.println("Sistemden Çıkış Yapılıyor...");
                } else {
                    System.out.println("Yeni Şifreniz Başarıyla Oluşturulmuştur!!!!");
                    System.out.println("Sisteme Giriş Yapılıyor...");
                }

            } else if(approvalStatus == 0) {
                System.out.println("Sistemden Çıkış Yapılıyor...");
            }
        }
    }
}
