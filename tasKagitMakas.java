import java.util.Scanner;

public class tasKagitMakas {
    public static void main(String[] args) {
        // taş(0), kağıt(1), makas(2)
        Scanner input = new Scanner(System.in);
        int skorBot = 0, skorSen = 0; // *isteğe bağlı* skor tablosu oluşturuyoruz.
        String ihtimaller[] =  {"taş", "kağıt", "makas"}; // ihtimallerimizi ihtimaller adında bir dizinin içerisinde tutuyoruz
        while (true){
            int rastgeleSayi = (int)(Math.random()*3); // [0,3) aralığında rastgele bir sayı seçer ve rastgeleSayi değişkenine atar.
            System.out.print("Hangisi (taş, kağıt, makas, skor, çık)? : ");
            String secilenDeger = input.nextLine();
            if (secilenDeger.equals("taş")){
                if (rastgeleSayi == 0){
                    System.out.println("**********************************************");
                    System.out.println("Bilgisayar: " + ihtimaller[rastgeleSayi] + ", sen: " + secilenDeger);
                    System.out.println("Durum: Berabere.");
                    System.out.println("**********************************************\n");
                }
                else if (rastgeleSayi == 1){
                    System.out.println("**********************************************");
                    System.out.println("Bilgisayar: " + ihtimaller[rastgeleSayi] + ", sen: " + secilenDeger);
                    System.out.println("Durum: Kaybettin.");
                    System.out.println("**********************************************\n");
                    skorBot++;
                }
                else if (rastgeleSayi == 2){
                    System.out.println("**********************************************");
                    System.out.println("Bilgisayar: " + ihtimaller[rastgeleSayi] + ", sen: " + secilenDeger);
                    System.out.println("Durum: Kazandın.");
                    System.out.println("**********************************************\n");
                    skorSen++;
                }
            }
            else if (secilenDeger.equals("kağıt")){
                if (rastgeleSayi == 0){
                    System.out.println("**********************************************");
                    System.out.println("Bilgisayar: " + ihtimaller[rastgeleSayi] + ", sen: " + secilenDeger);
                    System.out.println("Durum: Kazandın.");
                    System.out.println("**********************************************\n");
                    skorSen++;
                }
                else if (rastgeleSayi == 1){
                    System.out.println("**********************************************");
                    System.out.println("Bilgisayar: " + ihtimaller[rastgeleSayi] + ", sen: " + secilenDeger);
                    System.out.println("Durum: Berabere.");
                    System.out.println("**********************************************\n");
                }
                else if (rastgeleSayi == 2){
                    System.out.println("**********************************************");
                    System.out.println("Bilgisayar: " + ihtimaller[rastgeleSayi] + ", sen: " + secilenDeger);
                    System.out.println("Durum: Kaybettin.");
                    System.out.println("**********************************************\n");
                    skorBot++;
                }
            }
            else if (secilenDeger.equals("makas")){
                if (rastgeleSayi == 0){
                    System.out.println("**********************************************");
                    System.out.println("Bilgisayar: " + ihtimaller[rastgeleSayi] + ", sen: " + secilenDeger);
                    System.out.println("Durum: Kaybettin.");
                    System.out.println("**********************************************\n");
                    skorBot++;
                }
                else if (rastgeleSayi == 1){
                    System.out.println("**********************************************");
                    System.out.println("Bilgisayar: " + ihtimaller[rastgeleSayi] + ", sen: " + secilenDeger);
                    System.out.println("Durum: Kazandın.");
                    System.out.println("**********************************************\n");
                    skorSen++;
                }
                else if (rastgeleSayi == 2){
                    System.out.println("**********************************************");
                    System.out.println("Bilgisayar: " + ihtimaller[rastgeleSayi] + ", sen: " + secilenDeger);
                    System.out.println("Durum: Berabere.");
                    System.out.println("**********************************************\n");
                }
            }
            else if (secilenDeger.equals("çık")){
                System.out.println("**********************************************");
                System.out.println("Programdan çıkılıyor...");
                System.out.println("**********************************************\n");
                break;
            }
            else if (secilenDeger.equals("skor")) {
                System.out.println("**********************************************");
                System.out.println("Sen: " + skorSen + " | Bilgisayar: " + skorBot);
                if (skorSen == skorBot){
                    System.out.println("Durum: Berabere.");
                }
                else if (skorSen > skorBot){
                    System.out.println("Durum: Sen Öndesin.");
                }
                else{
                    System.out.println("Durum: Bilgisayar Önde.");
                }
                System.out.println("**********************************************\n");
            }
            else{
                System.out.println("**********************************************");
                System.out.println("Hatalı giriş! (taş, kağıt, makas, skor, çık)");
                System.out.println("**********************************************\n");
            }
        }
    }
}
