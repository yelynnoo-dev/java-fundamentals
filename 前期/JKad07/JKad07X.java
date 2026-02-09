/*
課題名:JKad07X
作成日:2025/05/13
作成者:YE LYNN OO
*/
import java.util.Random;
import java.util.Scanner;

public class JKad07X {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        int ans = rand.nextInt(100);
        int min = 0, max = 99;
        int count = 1;

        System.out.println("数当てゲーム！");

        while (true) {
        int guess;
		while (true){
			System.out.print(count + "回目：" + min + "から" + max + "までの数値を入力してください＞");
			guess = sc.nextInt();
			if(guess>=min){
				if(guess<=max){
					break;
				}
			}
		}

            if (ans == guess) {
                System.out.println("正解しました！");
                break;
            } else {
                if (ans < guess) {
                    System.out.println(guess + "より小さいです！");
                    max = guess - 1;
                } else {
                    System.out.println(guess + "より大きいです！");
                    min = guess + 1;
                }
            }
            count++;
        }

        sc.close(); 
    }
}