/*
課題名:JKad26A1
作成日:2025/7/22
作成者:YE LYNN OO
*/

import java.util.Scanner;

public class JKad26A1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("整数を入力してください＞");
        int n = sc.nextInt();

        String outputBinary = JKad26D.toBinaryString(n);
        int count = 0, loopCount = 0;

        for (int i = 0; i < 32; i++) {
            if ((n & 0x01) == 0x01) {
                count++;
            }
            n = n >>> 1;
            loopCount++;

            if (n == 0x00) {
                break;
            }
        }

        System.out.println(outputBinary);
        System.out.println("1は" + count + "個あります！");
        System.out.println(loopCount + "回ループしました！");
    }
}
