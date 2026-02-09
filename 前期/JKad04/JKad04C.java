/*
課題名：JKad04C
作成日：2025/4/24
作成者：YE LYNN OO
*/
import java.util.Scanner;
public class JKad04C { 
	public static void main(String[] args) { 
		Scanner sc= new Scanner(System.in);
		System.out.println("あなたのおなまえは？>");
		String name1=sc.nextLine();
		System.out.println(name1+"さん、こんにちは！\n年齢はいくつ？>");
		int age1=sc.nextInt();
		System.out.println(age1+"歳なのね！");
		sc.nextLine();
		System.out.print("あなたのおなまえは？>");
		String name2=sc.nextLine();
		System.out.print(name2+"さん、こんにちは！\n年齢はいくつ？>");
		int age2=sc.nextInt();
		System.out.print(age2+"歳なのね！");
	} 
}