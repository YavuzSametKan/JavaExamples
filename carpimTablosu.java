public class carpimTablosu {
    public static void main(String[] args) {
        /**
         Çarpım Tablosu;
         **/
        int tablonunSonSayisi = 10, i, j;
        for (i = 1; i <= tablonunSonSayisi; i++){
            System.out.println("************************************");
            for (j = 1; j <= tablonunSonSayisi; j++){
                System.out.println(i+" x "+j+" = "+i*j);
            }
            System.out.println("************************************");
        }
    }
}
