/*
課題名:JKad23A2
作成日:2025/7/10
作成者:YE LYNN OO
*/

import java.util.Scanner;

public class JKad23A2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("1より大きい整数を入力してください＞");
        int n = sc.nextInt();
        System.out.println("1から" + n + "まで加算します！");
        System.out.println("合計は" + integrate(n) + "です！！");
    }

    public static int integrate(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + integrate(n - 1);
        }
    }
}
