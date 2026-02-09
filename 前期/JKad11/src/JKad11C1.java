public class JKad11C1 {
    public static void main(String[] args) {
        double d = 0;
        float f = 0;
        System.out.println("*** double型に0.1ずつ加算していきます！ ***");
        for (int i = 0; i < 10; i++) {
            d += 0.1;
            System.out.println(d);
        }
        System.out.println("*** double型に0.1ずつ加算していきます！ ***");
        for (int i = 0; i < 10; i++) {
            f += 0.1;
            System.out.println(f);
        }
    }
}
