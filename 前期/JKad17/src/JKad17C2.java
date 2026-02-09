/*
課題名:JKad16A1
作成日:2025/6/19
作成者:YE LYNN OO
*/

import java.util.Scanner;

public class JKad17C2 {
    public static void main(String[] args) {
        int[] rank = {57300, 25000, 10000, 5000, 1000};
        Scanner sc = new Scanner(System.in);
        int i;
        for (i = 0; i < rank.length; i++) {
            System.out.println((i + 1) + "位:" + rank[i]);
        }
        System.out.print("あなたのスコアを入力してください＞");
        int score = sc.nextInt();

        for (i = 0; i < rank.length; i++) {
            if (score >= rank[i]) {
                break;
            }
        }
        if (i == rank.length) {
            System.out.println("ランキング外です！");
        } else {
            System.out.println((i + 1) + "位になります！");
        }
    }
}
