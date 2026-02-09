/*
課題名:JKad24D
作成日:2025/7/21
作成者:YE LYNN OO
*/

import java.util.Scanner;

public class JKad24D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("正の整数を入力してください＞");
        int n = sc.nextInt();

        switch (n %= 3) {
            case 0:
                System.out.println("割り切れました！");
                break;
            case 1:
                System.out.println("余りは1です！");
                break;
            case 2:
                System.out.println("余りは2です！");
                break;
        }
    }
}
