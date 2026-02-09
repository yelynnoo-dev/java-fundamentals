/*
課題名:JKad24B
作成日:2025/7/21
作成者:YE LYNN OO
*/

import java.util.Scanner;

public class JKad24B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("いま何月ですか？（1～12）＞");
        int n = sc.nextInt();
        switch (n) {
            case 3, 4, 5:
                System.out.println("春です！いい季節ですね！！");
                break;
            case 6, 7, 8:
                System.out.println("夏です！暑いですね！！");
                break;
            case 9, 10, 11:
                System.out.println("秋です！食べ物がおいしいですね！！");
                break;
            case 12, 1, 2:
                System.out.println("冬です！寒いですね！！");
                break;
            default:
                System.out.println("月は1月～12月までです！");
        }
    }
}
