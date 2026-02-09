import java.util.Scanner;

public class JKad12B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("そうだ！水族館へ行こう！！");
        System.out.print("あなたの年齢を入力してください＞");
        int age = sc.nextInt();
        if (age < 3) {
            System.out.println("無料です！");
        } else if (age < 6) {
            System.out.println("幼児料金:600円になります！");
        } else if (age < 15) {
            System.out.println("子供料金:1200円になります！");
        } else if (age < 65) {
            System.out.println("大人料金:2400円になります！");
        } else {
            System.out.println("シニア料金：2200円になります！");
        }
    }
}
