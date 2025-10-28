/*
課題名:JKad16A1
作成日:2025/6/17
作成者:YE LYNN OO
*/

import java.util.Random;
import java.util.Scanner;

public class JKad16A1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("生成する配列の要素数を入力してください＞");
        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = rand.nextInt(100);
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        int min = 0;
        for (int i = 1; i < size; i++) {
            if (arr[i] < arr[min]) {
                min = i;
            }
        }

        System.out.println("一番小さい値は" + min + "番目の" + arr[min] + "です！");
        System.out.println(min + "番目と0番目を入れ替えます！");

        int temp = arr[0];
        arr[0] = arr[min];
        arr[min] = temp;

        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        sc.close();
    }
}
