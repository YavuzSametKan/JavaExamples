import java.util.Scanner;
public class enBuyukSayi {
    public static void main(String[] args) {
        /*
        Girilen 3 sayıdan en büyüğünü bulan program;
        */
        Scanner val = new Scanner(System.in);
        System.out.print("1. sayıyı giriniz: ");
        long num1 = val.nextLong();
        System.out.print("2. sayıyı giriniz: ");
        long num2 = val.nextLong();
        System.out.print("3. sayıyı giriniz: ");
        long num3 = val.nextLong();
        long maxNum = 0;
        if (num1 > num2 && num1 > num3) {
            maxNum = num1;
        } else if (num2 > num1 && num2 > num3) {
            maxNum = num2;
        } else if (num3 > num1 && num3 > num2) {
            maxNum = num3;
        }
        System.out.println("Girilen en büyük sayı " + maxNum + " sayısıdır.");

    }
}
