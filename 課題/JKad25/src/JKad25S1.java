/*
課題名:JKad25S1
作成日:2025/7/24
作成者:YE LYNN OO
*/

import java.util.Scanner;

public class JKad25S1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] charArray = new int[26];
        System.out.print("英単語を入力してください＞");
        String str = sc.next();

        int otherCount = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'a' && c <= 'z') {
                charArray[c -= 'a']++;
            } else if (c >= 'A' && c <= 'Z') {
                charArray[c -= 'A']++;
            } else {
                otherCount++;
            }
        }
        for (int i = 0; i < charArray.length; i++) {
            System.out.println((char) ('A' + i) + ":" + charArray[i]);
        }
        System.out.println("その他:" + otherCount);
    }
}
