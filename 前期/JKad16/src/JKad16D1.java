/*
課題名:JKad16D1
作成日:2025/6/17
作成者:YE LYNN OO
*/
import java.util.Scanner;

public class JKad16D1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("1より大きい整数を入力してください＞");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
        sc.close();
    }
}
