import java.util.Scanner;

public class JKad13A2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("直列回路のスイッチ！");
        System.out.print("スイッチ1を入れますか？（1：ON、1以外：OFF）＞");
        int s1 = sc.nextInt();
        System.out.print("スイッチ2を入れますか？（1：ON、1以外：OFF）＞");
        int s2 = sc.nextInt();
        boolean b1 = (s1 == 1);
        boolean b2 = (s2 == 1);
        boolean light = b1 ^ b2;
        System.out.println(light ? "照明が点きました！" : "照明が点きません！");
    }
}
