import java.util.Scanner;

public class JKad13B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("直列回路のスイッチ！");
        System.out.print("スイッチ1を入れますか？（1：ON、1以外：OFF）＞");
        int s1 = sc.nextInt();
        System.out.print("スイッチ2を入れますか？（1：ON、1以外：OFF）＞");
        int s2 = sc.nextInt();
        boolean b1 = (s1 == 1);
        boolean b2 = (s2 == 1);

        System.out.println("スイッチ1:" + (b1 ? "ON" : "OFF"));
        System.out.println("スイッチ2:" + (b2 ? "ON" : "OFF"));

        while (!(b1 && b2)) {
            System.out.print("どちらのスイッチを操作しますか？（1：スイッチ1、1以外：スイッチ2）＞");
            int s3 = sc.nextInt();
            boolean b3 = (s3 == 1);
            b1 = b3 ? !b1 : b1;
            b2 = b3 ? b2 : !b2;

            System.out.println("スイッチ1:" + (b1 ? "ON" : "OFF"));
            System.out.println("スイッチ2:" + (b2 ? "ON" : "OFF"));

        }
        System.out.println( "照明が点きました！");
    }
}
