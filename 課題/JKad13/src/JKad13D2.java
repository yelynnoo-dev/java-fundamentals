import java.util.Scanner;

public class JKad13D2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("直列回路のスイッチ！");
        System.out.print("スイッチ1を入れますか？（1：ON、1以外：OFF）＞");
        int s1 = sc.nextInt();
        System.out.print("スイッチ2を入れますか？（1：ON、1以外：OFF）＞");
        int s2 = sc.nextInt();
        if (s1 == 1 || s2 == 1) {
            System.out.println("照明が点きました！");
        } else {
            System.out.println("照明が点きません！");
        }
    }
}
