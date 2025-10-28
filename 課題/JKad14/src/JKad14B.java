import java.util.Random;
import java.util.Scanner;

public class JKad14B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int target = rand.nextInt(100);
        int guess, count = 0;
        System.out.println("0から99までの数値を当ててください！");
        while (true) {
            count++;
            System.out.print(count + "回目：数値を入力してください＞");
            guess = sc.nextInt();
            if (guess < 0 || guess > 99) {
                System.out.println("0から99までの数値を当ててください！");
                count--;
                continue;
            }
            if (guess == target) {
                System.out.println("正解しました！");
                break;
            }
            System.out.println(guess < target ? guess + "より大きいです！" : guess + "より小さいです！");
        }
    }
}
