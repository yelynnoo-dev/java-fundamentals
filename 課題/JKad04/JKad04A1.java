/*
課題名：JKad04A1
作成日：2025/4/24
作成者：YE LYNN OO
*/
import java.util.Scanner;
public class JKad04A1 { 
	public static void main(String[] args) { 
		Scanner sc= new Scanner(System.in);
		System.out.print("教室番号を入力してください＞");
		int n=sc.nextInt();
		int ones = n % 10;
		int tens = (n / 10) % 10;
		int hundreds = (n / 100) % 10;
		int thousands = (n / 1000) % 10;
		
		System.out.println("一の位\t" + ones);
		System.out.println("十の位\t" + tens);
		System.out.println("百の位\t" + hundreds);
		System.out.println("千の位\t" + thousands);

		/*
		String nstr=String.valueOf(n);
		System.out.println("一の位\t"+nstr.charAt(3));
		System.out.println("十の位\t"+nstr.charAt(2));
		System.out.println("百の位\t"+nstr.charAt(1));
		System.out.println("千の位\t"+nstr.charAt(0));
		*/
	} 
}