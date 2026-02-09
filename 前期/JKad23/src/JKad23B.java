/*
課題名:JKad23B
作成日:2025/7/10
作成者:YE LYNN OO
*/

import java.util.Scanner;

public class JKad23B {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("ジャックは豆をまいた！ \n" + "次の日、天まで届く豆の木に成長した！ \n" + "ここを登ればきっと宝物があるに違いない！！\n");
        climbBeanTree();
        System.out.println("めでたし、めでたし。");
    }

    public static void climbBeanTree() {
        System.out.println("ジャックは豆の木を登った！");
        System.out.print("どうしますか？（1：登る、それ以外：もう疲れた）＞");
        int n = sc.nextInt();
        if (n == 1) {
            climbBeanTree();
        }
        System.out.println("ジャックは豆の木を降りた！ ");

    }
}
