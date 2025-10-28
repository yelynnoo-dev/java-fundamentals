/*
課題名:JKad23A1
作成日:2025/7/10
作成者:YE LYNN OO
*/

import java.util.Scanner;

public class JKad23A1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ひとつめの整数を入力してください＞");
        int n1 = sc.nextInt();
        System.out.print("ふたつめの整数を入力してください＞");
        int n2 = sc.nextInt();
        System.out.println("最大公約数は" + gcd(n1, n2) + "です！");
        System.out.println("最小公倍数は" + lcm(n1, n2) + "です！");
    }

    public static int lcm(int n1, int n2) {
        return n1 * n2 / gcd(n1, n2);
    }

    public static int gcd(int n1, int n2) {
        while (n1 != n2) {
            if (n1 > n2) {
                n1 -= n2;
            } else {
                n2 -= n1;
            }
        }
        return n1;
    }
}
