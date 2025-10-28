import java.util.Scanner;

public class JKad12A1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("そうだ！動物園へ行こう！！");
        System.out.print("何人で行きますか？＞");
        int group = sc.nextInt();
        System.out.print("あなたの年齢を入力してください＞");
        int age = sc.nextInt();
        if (age < 6) {
            System.out.println("無料です！");
        } else if (age < 15) {
            if (group >= 50) {
                System.out.println("子供料金：160円になります！");
            } else if (group >= 30) {
                System.out.println("子供料金：180円になります！");
            } else {
                System.out.println("子供料金：200円になります！");
            }
        } else {
            if (group >= 50) {
                System.out.println("大人料金：400円になります！");
            } else if (group >= 30) {
                System.out.println("大人料金：450円になります！");
            } else {
                System.out.println("大人料金：500円になります！");
            }
        }
    }
}
