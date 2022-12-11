import java.util.Scanner;

public class DaireninAlaniCevresi {
    public static void main(String[] args) {
        Scanner val = new Scanner(System.in);
        System.out.print("Yarıçap Uzunluğu Giriniz: ");
        double r = val.nextDouble();
        if (r > 0){
            double π = Math.PI;
            double S = π*r*r;
            double L = 2*π*r;
            System.out.println("Alan = " + S + " br²");
            System.out.println("Çevre = " + L + " br²");
        }
        else {
            System.out.println("Yarıçap pozitif sayı olmalıdır.");
        }
    }
}
