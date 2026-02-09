/*
課題名:JKad23C2
作成日:2025/7/10
作成者:YE LYNN OO
*/

import java.util.Scanner;

public class JKad23C2 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("西暦年号を入力してください＞");
        int n = sc.nextInt();
        boolean leapYear = isLeapYear(n);
        System.out.println(leapYear ? "うるう年です！" : "うるう年ではありません！");
    }

    public static boolean isLeapYear(int n) {
        if ((n % 4 == 0 && n % 100 != 0) || (n % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }
}
