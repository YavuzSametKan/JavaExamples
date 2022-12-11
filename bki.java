import java.util.Scanner;
public class bki {
    public static void main(String[] args) {
        /*
        Beden kitle indeksi uygulaması;

        Beden kitle indeksi hesabı = kütle(kg) / uzunluk(m) * uzunluk(m)
        0-18,5 Zayıf | 18,5-24,9 Normal | 24,9-29,9 Kilolu | 29,9+ Obez
        */
        Scanner val = new Scanner(System.in);
        System.out.print("Kilonuzu girin (kg): ");
        double mass = val.nextDouble();
        System.out.print("Boyunuzu girin (Örnek: 160) (cm): ");
        double length = val.nextDouble() / 100;
        double bki = mass / (length * length);
        System.out.println("Boy kitle indeksi: " + bki);
        String status = null;
        if (bki < 18.5) status = "Zayıf";
        else if (bki > 18.5 && bki < 24.9) status = "Normal";
        else if (bki > 24.9 && bki < 29.9) status = "Kilolu";
        else if (bki > 29.9) status = "Obez";
        System.out.println("Durumunuz: " + status);

    }
}
