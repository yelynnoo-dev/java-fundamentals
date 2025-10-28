/*
課題名:JKad16A1
作成日:2025/6/19
作成者:YE LYNN OO
*/

import java.util.Random;
import java.util.Scanner;

public class JKad17X {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        String[] hand = {"騎士", "弓兵 ", "槍兵", "将軍", "スパイ"};
        String[] result = {"あなたの勝ち！", "あなたの負け！", "あいこだ！"};
        int[][] ans = {{2, 0, 1, 1, 0}, {1, 2, 0, 1, 0}, {0, 1, 2, 1, 0}, {0, 0, 0, 2, 1}, {1, 1, 1, 0, 2}};
        for (; ; ) {
            System.out.print("あなたは何を出しますか？（0：騎士、1：弓兵、2：槍兵、3：将軍、4：スパイ、-1：終了）＞");
            int user = sc.nextInt();
            int cpu = rand.nextInt(5);
            if (user < 0) {
                break;
            }
            System.out.println("あなたは" + hand[user] + "を出した！");
            System.out.println("CPUは" + hand[cpu] + "を出した！");
            System.out.println(ans[user][cpu] == 0 ? result[0] : ans[user][cpu] == 1 ? result[1] : result[2]);
        }
    }
}
