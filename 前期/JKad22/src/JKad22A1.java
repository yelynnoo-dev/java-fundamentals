/*
課題名:JKad22A1
作成日:2025/7/8
作成者:YE LYNN OO
*/

import java.util.Scanner;

public class JKad22A1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("1より大きい整数1を入力してください＞");
        int n1 = sc.nextInt();
        System.out.print("1より大きい整数1を入力してください＞");
        int n2 = sc.nextInt();

        System.out.println(n1 + "÷" + n2 + "の商と余りを計算します！");
        System.out.print("誰が計算しますか？（1:出木杉、それ以外:のび太）＞");
        int choice = sc.nextInt();

        if (choice == 1) {
            dekisugi(n1, n2);
        } else {
            nobita(n1, n2);
        }
    }

    public static void dekisugi(int n1, int n2) {
        System.out.println("そんなの簡単さ！");
        System.out.println("商は" + n1 / n2 + "、余りは" + n1 % n2 + "だよ。");
    }

    public static void nobita(int n1, int n2) {
        int count = 0;
        while (n1 >= n2) {
            n1 -= n2;
            count++;
        }
        System.out.println("う～ん、割り算なんて難しいや～ ");
        System.out.println("あ、そうか！リンゴを食べる問題と一緒だね！");
        System.out.println("商は" + count + "、余りは" + n1 + "だよ。");
    }
}
