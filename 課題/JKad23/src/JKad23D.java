/*
課題名:JKad23D
作成日:2025/7/10
作成者:YE LYNN OO
*/

import java.util.Random;
import java.util.Scanner;

public class JKad23D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("0～99までの数値を作ります！いくつ作りますか？＞");
        int n = sc.nextInt();
        int[] array = new int[n];
        setArray(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+"\t");
        }
    }

    public static void setArray(int[] array) {
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(100);
        }
    }
}
