/*
課題名:JKad22S
作成日:2025/7/8
作成者:YE LYNN OO
*/

import java.util.Random;
import java.util.Scanner;

public class JKad22S {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("ここはECC苦情処理センターです！");
        System.out.println("優秀なスタッフが対応します！");

        while (true) {
            int n = rand.nextInt(100);
            System.out.println("苦情番号:" + n + "を受け付けた！");
            System.out.print("どうしますか？（1:対応する、それ以外:もうやだ）＞");
            int input = sc.nextInt();

            if (input == 1) {
                nobita(n);
            } else {
                System.out.println("おつかれさまでした！");
                break;
            }
        }
    }

    public static void nobita(int n) {
        if (n < 20) {
            System.out.println("ぼくにまかせて");
            System.out.println("のび太が対応しました！");
        } else {
            System.out.println("のび太「ジャイアン、お願い！」");
            jaian(n);
        }
    }

    public static void jaian(int n) {
        if (n % 25 == 0) {
            System.out.println("オレさまにまかせろ！");
            System.out.println("ジャイアンが対応しました！");
        } else {
            System.out.println("ジャイアン「スネ夫、お前にゆずってやる！」");
            suneo(n);
        }
    }

    public static void suneo(int n) {
        if (n % 3 == 0) {
            System.out.println("ぼくの出番だ！");
            System.out.println("スネ夫が対応しました！");
        } else {
            System.out.println("スネ夫「出木杉！まかせた！」");
            dekisugi(n);
        }
    }

    public static void dekisugi(int n) {
        System.out.println("こんなの簡単さ");
        System.out.println("出木杉が対応しました！");
    }
}
