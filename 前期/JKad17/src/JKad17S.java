/*
課題名:JKad16A1
作成日:2025/6/19
作成者:YE LYNN OO
*/

import java.util.Random;
import java.util.Scanner;

public class JKad17S {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        String[] hand = {"グー", "チョキ", "パー"};
        String[] result = {"あなたの勝ち！", "あなたの負け！", "あいこだ！"};
        int[][] ans = {{2, 0, 1}, {1, 2, 0}, {0, 1, 2}};
        for (; ; ) {
            System.out.print("あなたは何を出しますか？（0：グー、1：チョキ、2：パー、-1：終了）＞");
            int user = sc.nextInt();
            int cpu = rand.nextInt(3);
            if (user < 0) {
                break;
            }

            System.out.println("あなたは" + hand[user] + "を出した！ ");
            System.out.println("CPUは" + hand[cpu] + "を出した！ ");
            System.out.println(ans[user][cpu] == 0 ? result[0] : ans[user][cpu] == 1 ? result[1] : result[2]);
        }
    }
}
