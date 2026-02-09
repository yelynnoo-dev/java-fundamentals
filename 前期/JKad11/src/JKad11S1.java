public class JKad11S1 {
    public static void main(String[] args) {
        double r = Math.random();
//        int r1=(int)(r*10+0.5)/10;
        int r1 = (r > 0.5) ? 1 : 0;
        double r2 = (int) (r * 10 + 0.5) / 10.0;
        double r3 = (int) (r * 100 + 0.5) / 100.0;
        System.out.println("取得した乱数 \t" + r);
        System.out.println("小数第1位で四捨五入 \t" + r1);
        System.out.println("小数第2位で四捨五入 \t" + r2);
        System.out.println("小数第3位で四捨五入 \t" + r3);
    }
}
