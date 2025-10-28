/*
課題名:JKad24C
作成日:2025/7/21
作成者:YE LYNN OO
*/

import java.util.Scanner;

public class JKad24C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final int IE = 1;
        final int SK = 2;
        final int SE = 3;

        System.out.println("わたしはスーパーティーチャー、ECCエクセレントよ！");
        System.out.print("あなたのクラスを教えてね！（1：IE、2：SK、3：SE、それ以外：わからない＞");
        int n = sc.nextInt();

        switch (n) {
            case IE:
                System.out.println("4年制コースなのね！");
                break;
            case SK:
                System.out.println("3年制コースなのね！");
                break;
            case SE:
                System.out.println("2年制コースなのね！");
                break;
            default:
                System.out.println("わからないのね！");
        }
    }
}
