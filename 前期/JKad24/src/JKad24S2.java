/*
課題名:JKad24S2
作成日:2025/7/21
作成者:YE LYNN OO
*/

import java.util.Scanner;

public class JKad24S2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("正の整数を入力してください＞");
        int n = sc.nextInt();
        String str = "";

        do {
            switch (n % 16) {
                case 10 -> str = 'A' + str;
                case 11 -> str = 'B' + str;
                case 12 -> str = 'C' + str;
                case 13 -> str = 'D' + str;
                case 14 -> str = 'E' + str;
                case 15 -> str = 'F' + str;
                default -> str = (n % 16) + str;
            }

            n /= 16;

        } while (n > 0);
        System.out.println("16 進数にすると" + str + "になります！ ");
    }
}
