/*
課題名:JKad24A1
作成日:2025/7/21
作成者:YE LYNN OO
*/

import java.util.Scanner;

public class JKad24A1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("正の整数を入力してください＞");
        int n = sc.nextInt();
        String str = "";

        do {
            switch (n % 16) {
                case 10:
                    str = 'A' + str;
                    break;
                case 11:
                    str = 'B' + str;
                    break;
                case 12:
                    str = 'C' + str;
                    break;
                case 13:
                    str = 'D' + str;
                    break;
                case 14:
                    str = 'E' + str;
                    break;
                case 15:
                    str = 'F' + str;
                    break;
                default:
                    str = (n % 16) + str;
            }

            n /= 16;

        } while (n > 0);
        System.out.println("16 進数にすると" + str + "になります！ ");
    }
}