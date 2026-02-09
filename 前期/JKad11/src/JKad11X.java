import java.util.Random;
import java.util.Scanner;

public class JKad11X {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("モンテカルロ・シミュレーションで円周率を求めます！");
        System.out.print("何回シミュレーションしますか？＞");
        int total = sc.nextInt();
        int inside = 0;
        for (int i = 0; i < total; i++) {
            double x = rand.nextDouble();
            double y = rand.nextDouble();
            if (((x * x) + (y * y)) <= 1) {
                inside++;
            }
        }
        double pi = 4.0 * inside / total;
        System.out.println("円周率は" + pi + "です！");
    }
}
