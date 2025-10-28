/*
課題名:JKad21D
作成日:2025/7/3
作成者:YE LYNN OO
*/

import java.util.Scanner;

public class JKad21D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        while (true) {
            System.out.print("どの段を表示しますか？（1～9）＞");
            n = sc.nextInt();
            if (n < 0) break;
            else {
                for (int i = 1; i <= 9; i++) {
                    System.out.print((n * i) + "\t");
                }
                System.out.println();
            }
        }
        sc.close();
    }
}
