/*
課題名:JKad26B
作成日:2025/7/22
作成者:YE LYNN OO
*/

import java.util.Scanner;

public class JKad26B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("整数1を入力してください＞");
        int n1 = sc.nextInt();
        System.out.print("整数1を入力してください＞");
        int n2 = sc.nextInt();
        System.out.println(JKad26D.toBinaryString(n1));
        System.out.println(JKad26D.toBinaryString(n2));
        while (true) {
            System.out.print("何の演算をしますか？（0:AND、1:OR、2:XOR）＞");
            int op = sc.nextInt();
            int str = 0;
            if (op < 0) break;
            switch (op) {
                case 0 -> str = n1 & n2;
                case 1 -> str = n1 | n2;
                case 2 -> str = n1 ^ n2;
            }
            System.out.println(JKad26D.toBinaryString(str));
        }
    }
}
