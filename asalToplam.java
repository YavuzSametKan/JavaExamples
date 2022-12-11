public class asalToplam {
    public static void main(String[] args) {//(Project Euler)
        // 2 3 5 7 = 17
        long sinir = 2000000, i, toplam = 2, j, sayac = 0;
        for (i = 2; i<sinir; i++){
            for (j = 2; j < Math.sqrt(i)+1; j++){
                if (i % j == 0){
                    sayac++;
                }
            }
            if (sayac == 0){
                toplam += i;
            }
            sayac = 0;
        }
        System.out.println(toplam);
    }
}
