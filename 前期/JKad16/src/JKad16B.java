/*
課題名:JKad16B
作成日:2025/6/17
作成者:YE LYNN OO
*/
import java.util.Random;
import java.util.Scanner;

public class JKad16B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("生成する配列の要素数を入力してください＞");
        int size = sc.nextInt();
        int[] arr = new int[size];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100);
            System.out.print(arr[i] + "\t");
            sum += arr[i];
        }
        System.out.println();
        double avg = (double) sum / arr.length;
        System.out.println("合計は" + sum + "、平均は" + avg);

        sc.close();
    }
}
