/*
課題名:JKad21A1
作成日:2025/7/3
作成者:YE LYNN OO
*/

import java.util.Scanner;

public class JKad21A1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("9桁までの整数を入力してください＞");
        int n = sc.nextInt();
        while (n > 0) {
            int digit = n % 10;
            for (int i = 0; i < digit; i++) {
                System.out.print("*");
            }
            System.out.println();
            n /= 10;
        }
    }
}
