/*
課題名:JKad26C
作成日:2025/7/22
作成者:YE LYNN OO
*/

import java.util.Scanner;

public class JKad26C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("整数を入力してください＞");
        int n = sc.nextInt();

        while (true) {
            System.out.println(JKad26D.toBinaryString(n));
            System.out.print("何の演算をしますか？（0：<<、1：~、2：>>、3：>>>）＞");
            int op = sc.nextInt();
            if (op < 0) break;
            switch (op) {
                case 0 -> n = n << 1;
                case 1 -> n = ~n;
                case 2 -> n = n >> 1;
                case 3 -> n = n >>> 1;
            }
        }
    }
}
