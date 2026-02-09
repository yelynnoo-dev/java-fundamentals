/*
課題名:JKad22A2
作成日:2025/7/8
作成者:YE LYNN OO
*/

import java.util.Scanner;

public class JKad22A2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("直角二等辺三角形の面積を求めます！");
        System.out.print("斜辺の長さを入力してください＞");
        int leghth = sc.nextInt();
        System.out.print("誰が計算しますか？（1:出木杉、それ以外:しずか）＞");
        int choice = sc.nextInt();

        if (choice == 1) {
            dekisugi(leghth);
        } else {
            sizuka(leghth);
        }
    }

    public static void dekisugi(double length) {
        double height = length / 1.41421356;
        double area = height * height / 2;
        System.out.println("そんなの簡単さ！");
        System.out.println("三角形の面積は底辺×高さ÷2だから、底辺と高さを求めればいいんだ！");
        System.out.println("底辺が" + height + "、高さも同じだから");
        System.out.println("直角二等辺三角形の面積は" + area + "だよ！");
    }

    public static void sizuka(double length) {
        double squareArea = length * length;
        double area = squareArea / 4;
        System.out.println("う～ん、底辺と高さはどうやって求めたらいいの？ ");
        System.out.println("そうだわ！直角二等辺三角形が4つで正方形になるから、正方形の面積を求めて4で割ればいいんだわ！");
        System.out.println("正方形の面積は" + squareArea + "だから ");
        System.out.println("直角二等辺三角形の面積は" + area + "ね！");
    }
}
