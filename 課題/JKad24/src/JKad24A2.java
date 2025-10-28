/*
課題名:JKad24A2
作成日:2025/7/21
作成者:YE LYNN OO
*/

import java.util.Scanner;

public class JKad24A2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("「月」を入力してください＞");
        int month = sc.nextInt();
        System.out.print("「日」を入力してください＞");
        int date = sc.nextInt();
        int days = 0, n = 0;
        String[] week = {"日", "月", "火", "水", "木", "金", "土",};

        switch (month) {
            case 12:
                days += 31;
            case 11:
                days += 30;
            case 10:
                days += 31;
            case 9:
                days += 30;
            case 8:
                days += 31;
            case 7:
                days += 31;
            case 6:
                days += 30;
            case 5:
                days += 31;
            case 4:
                days += 30;
            case 3:
                days += 28;
            case 2:
                days += 31;
            case 1:
                break;
        }
        days += date;
        n = days % 7;

        System.out.println(month + "月" + date + "日" + days + "日目です！");
        System.out.println(week[n] + "曜日です！");
    }
}
