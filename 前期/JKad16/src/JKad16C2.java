/*
課題名:JKad16C2
作成日:2025/6/17
作成者:YE LYNN OO
*/

import java.util.Random;
import java.util.Scanner;

public class JKad16C2 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.print("生成する配列の要素数を入力してください＞");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100);
            System.out.print(arr[i] + "\t");
        }
    }
}
