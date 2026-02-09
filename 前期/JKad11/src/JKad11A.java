import java.util.Scanner;

public class JKad11A {
    public static void main(String[] args) {
        final double PI = 3.14159265;
        Scanner sc = new Scanner(System.in);
        System.out.print("半径を入力してください＞");
        double r = sc.nextDouble();
        double v = (4.0 / 3 * PI) * (r * r * r);
//        double v=(4*(PI)*(r*r*r))/3;
        System.out.println("半径" + r + "の球の体積は" + v + "です！");
    }
}
