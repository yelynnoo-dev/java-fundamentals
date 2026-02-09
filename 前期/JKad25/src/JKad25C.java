/*
課題名:JKad25C
作成日:2025/7/17
作成者:YE LYNN OO
*/

import java.util.Scanner;

public class JKad25C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("英単語を入力してください＞");
        String str = sc.next();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            String hex = Integer.toHexString(c);
            System.out.println(c + "の文字コード:0x" + hex);
        }
    }
}
