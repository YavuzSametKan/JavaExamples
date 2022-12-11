import java.util.Scanner;

public class armstrong {
    public static void main(String[] args) {
        /**
         Armstrong sayı;
         153 = 1x1x1 + 5x5x5 + 3x3x3 = 1³ + 5³ + 3³
         153 armstrong sayıdır.
         **/
        Scanner val = new Scanner(System.in);
        System.out.print("Lütfen bir sayı girin: ");
        long sayi = val.nextLong(), geciciSayi = sayi, armstrong = 0;
        byte basamakSayisi = 0, rakam;
        while(geciciSayi > 0){
            geciciSayi /= 10;
            basamakSayisi++;
        }
        geciciSayi = sayi;
        while (geciciSayi > 0){
            rakam = (byte) (geciciSayi % 10);
            geciciSayi /= 10;
            armstrong += Math.pow(rakam, basamakSayisi);
        }
        if(armstrong == sayi){
            System.out.println(sayi + " bir armstrong sayıdır.");
        }
        else{
            System.out.println(sayi + " bir armstrong sayı değildir.");
        }
    }
}
