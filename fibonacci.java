public class fibonacci {
    public static void main(String[] args) {
        // 1, 1, 2, 3, 5, 8, 13, 21
        // a  b  c
        //    a  b  c
        long a = 1, b = 1, c;
        System.out.print("1, 1");
        for (int i = 0; i < 8; i++){
            c = a+b;
            a = b;
            b = c;
            System.out.print(", " + c);
        }

    }
}
