/*
課題名:JKad26A2
作成日:2025/7/22
作成者:YE LYNN OO
*/

import java.util.Scanner;

public class JKad26A2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("整数を入力してください＞");
        int n = sc.nextInt();

        String outputBinary = toBinaryString(n);
        int count = 0, loopCount = 0;

        while (n != 0x00) {
            n = n & (n - 1);
            count++;
            loopCount++;
        }

        System.out.println(outputBinary);
        System.out.println("1は" + count + "個あります！");
        System.out.println(loopCount + "回ループしました！");
    }
    public static String toBinaryString(int n) {
        String strBinary = "(" + n + ")";
        for (int i = 0; i < 32; i++) {
            if ((n & 0x01) == 0x01) {
                strBinary = "1" + strBinary;
            } else {
                strBinary = "0" + strBinary;
            }
            n = n >>> 1;
            if ((i % 4) == 3) {
                strBinary = " " + strBinary;
            }
        }
        return strBinary;
    }
}
