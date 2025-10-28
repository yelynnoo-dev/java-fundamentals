/*
課題名:JKad24S1
作成日:2025/7/21
作成者:YE LYNN OO
*/

import java.util.Scanner;

public class JKad24S1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("いま何月ですか？（1～12）＞");
        int n = sc.nextInt();

        switch (n) {
            case 3, 4, 5 -> System.out.println("春です！いい季節ですね！！");
            case 6, 7, 8 -> System.out.println("夏です！暑いですね！！");
            case 9, 10, 11 -> System.out.println("秋です！食べ物がおいしいですね！！");
            case 12, 1, 2 -> System.out.println("冬です！寒いですね！！");
            default -> System.out.println("月は1月～12月までです！");
        }
    }
}
