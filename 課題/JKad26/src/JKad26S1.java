import java.util.Scanner;

/*
課題名:JKad26S1
作成日:2025/7/22
作成者:YE LYNN OO
*/
public class JKad26S1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("整数1を入力してください＞");
        int n1 = sc.nextInt();
        System.out.print("整数2を入力してください＞");
        int n2 = sc.nextInt();
        System.out.println(JKad26D.toBinaryString(n1));
        System.out.println(JKad26D.toBinaryString(n2));
        int result = 0;
        while (true) {
            System.out.print("何を検出しますか？（0:0→1、1:1→0、2:変化なし）＞");
            int input = sc.nextInt();
            if (input < 0) break;
            switch (input) {
                case 0 -> result = (~n1) & n2;
                case 1 -> result = n1 & (~n2);
                case 2 -> result = (~n1 & ~n2) | (n1 & n2);
            }
            System.out.println(JKad26D.toBinaryString(result));
        }
    }
}
