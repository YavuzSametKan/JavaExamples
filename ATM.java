import java.util.Scanner;
public class ATM {
    public static void main(String[] args) {
        /**
        ATM uygulaması;
        **/
        Scanner val = new Scanner(System.in);
        System.out.println( "1.İşlem : bakiye öğrenme\n"+
                            "2.İşlem : para çekme\n"+
                            "3.İşlem : para yatırma\n"+
                            "q çıkış yapma");
        long bakiye = 0;
        while(true){
            System.out.print("İşlem seçin: ");
            String islem = val.nextLine();
            if(islem.equals("q")){ // çıkış yapma
                System.out.println("Programdan Çıkılıyor...");
                break;
            }
            else if(islem.equals("1")){ // bakiye öğrenme
                System.out.println("Bakiyeniz: " + bakiye + "tl");
            }
            else if(islem.equals("2")){ // para çekme
                System.out.print("Çekilecek tutarı giriniz: ");
                long cekilecekPara = val.nextLong();
                val.nextLine();// Dummy kullanımı
                if(bakiye - cekilecekPara > 0){
                    if(cekilecekPara <= 0){
                        System.out.println("Girilen değer pozitif tam sayı olmalıdır.");
                    }
                    else{
                        bakiye -= cekilecekPara;
                        System.out.println("Yeni bakiyeniz: " + bakiye + "tl");
                    }
                }else{
                    System.out.println("Yetersiz bakiye. " + "(bakiyeniz: " + bakiye + "tl)");
                }
            }
            else if(islem.equals("3")){ // para yatırma
                System.out.print("Yatırılacak tutarı giriniz: ");
                long yatirilacakPara = val.nextLong();
                val.nextLine(); // Dummy Kullanım
                if(yatirilacakPara > 0){
                    bakiye += yatirilacakPara;
                    System.out.println("Yeni bakiyeniz: " + bakiye + "tl");
                }else{
                    System.out.println("Girilen değer pozitif tam sayı olmalıdır.");
                }

            }
            else{
                System.out.println("Böyle bir işlem bulunamadı.(İşlemler: 1,2,3,q)");
            }
        }
    }
}
