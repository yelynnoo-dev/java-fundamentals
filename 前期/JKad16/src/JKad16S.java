/*
課題名:JKad16A1
作成日:2025/6/17
作成者:YE LYNN OO
*/

import java.util.Scanner;

public class JKad16S {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("出席状況を入力してください。");
        int present = 0, absent = 0, late = 0;
        final int week = 15;

        for (int i = 1; i <= week; i++) {
            System.out.print("第" + i + "週目：（0：出席、1：欠席、2：遅刻）＞");
            int n = sc.nextInt();
            if (n == 0) {
                present++;
            } else if (n == 1) {
                absent++;
            } else if (n == 2) {
                late++;
            }
        }

        int totalAbsent = absent + (late / 3);
        double attendance = (double) ((week - totalAbsent) * 100) / week;
        attendance = (int) (attendance * 10 + 0.5) / 10;
        System.out.println("出席:" + present + "回");
        System.out.println("欠席:" + totalAbsent + "回");
        System.out.println("遅刻:" + late + "回");
        System.out.println("出席率は" + attendance + "％です！" + (attendance >= 75.0 ? "出席率OKです！" : "出席率NGです！"));
    }
}
