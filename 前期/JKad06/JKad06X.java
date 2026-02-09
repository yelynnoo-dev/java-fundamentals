/*
課題名:JKad06X
作成日:2025/05/08
作成者:YE LYNN OO
*/
import java.util.Scanner;
import java.util.Random;
public class JKad06X{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        Random rand = new Random();
		
		int target = rand.nextInt(100); 
        int guess;
        int attempts = 0;

		System.out.println("数当てゲーム！");

        while (true) {
            attempts++;
            System.out.print(attempts + "回目：数値を入力してください＞");
            guess = sc.nextInt();

            if (guess > target) {
                System.out.println(guess + "より小さいです！");
            } else if (guess < target) {
                System.out.println(guess + "より大きいです！");
            } else {
                System.out.println("正解しました！");
                break;
            }
        }

        sc.close();

	}
}