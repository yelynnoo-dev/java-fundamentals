/*
課題名:JKad16A1
作成日:2025/6/19
作成者:YE LYNN OO
*/

import java.util.Scanner;

public class JKad17D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int room;
        String[] name = {"ピタゴラス", "アルキメデス", "ユークリッド", "エラトステネス", "フィボナッチ"};
        for (; ; ) {
            System.out.print("部屋番号を入力してください＞");
            room = sc.nextInt();
            if (room < 0) {
                break;
            }
            if (room >= 0 && room < name.length) {
                System.out.println(room + "号室には" + name[room] + "が住んでいます！");
            } else {
                System.out.println("その部屋は存在しません！");
            }
        }
        sc.close();
    }
}
