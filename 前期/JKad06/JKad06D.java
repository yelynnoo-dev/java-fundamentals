/*
課題名:JKad06D
作成日:2025/05/08
作成者:YE LYNN OO
*/
import java.util.Scanner;
public class JKad06D{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("ひとり一つずつリンゴを食べます！");
		System.out.print("リンゴの数を入力してください＞");
		int apple=sc.nextInt();
		System.out.print("食べる人の数を入力してください＞");
		int people=sc.nextInt();
		while(apple>=people){
			apple-=people;
			System.out.println("ひとり一つずつリンゴを食べた！");
			System.out.println("残ったリンゴは"+apple+"個です！");			
		}
		sc.close();
	}
}
