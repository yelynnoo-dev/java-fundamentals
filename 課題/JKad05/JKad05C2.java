/*
課題名：JKad05C2
作成日：5/1/2025
作成者：YE LYNN OO
*/
import java.util.Scanner;
public class JKad05C2{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("ひとり一つずつリンゴを食べます！");
		System.out.print("リンゴの数を入力してください＞");
		int apple=sc.nextInt();
		System.out.print("食べる人の数を入力してください＞");
		int people=sc.nextInt();
		System.out.println("ひとり一つずつリンゴを食べた！");
		int leftover=apple-people;
		if(people>=apple){
			System.out.println("リンゴの数が足りません！ ");
		}
		else{
			System.out.println("残ったリンゴは"+leftover+"個です！");
		}
	}
}