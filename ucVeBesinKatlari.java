public class ucVeBesinKatlari {
    public static void main(String[] args) {
        /**
         10'un altındaki 3 veya 5'in katı olan tüm doğal sayıları sıralarsak 3, 5, 6 ve 9 elde ederiz. Bu katların toplamı 23'tür.
         1000'in altındaki 3 veya 5'in tüm katlarının toplamını bulun. (Project Euler)
         **/
        int toplam = 0;
        for (int i = 1; i < 1000; i++) {
            if (i % 3 == 0) {
                toplam += i;
            }
            else if (i % 5 == 0) {
                toplam += i;
            }
        }
        System.out.println(toplam);
    }
}
