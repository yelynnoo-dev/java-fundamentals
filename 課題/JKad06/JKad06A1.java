/*
課題名:JKad06A1
作成日:2025/05/08
作成者:YE LYNN OO
*/
import java.util.Scanner;
public class JKad06A1{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("整数1を入力してください＞");
		int dividend=sc.nextInt();
		System.out.print("整数2を入力してください＞");
		int divisor=sc.nextInt();
		int quotient=0;
		int remainder=dividend;
		System.out.println(dividend+"÷"+divisor+"を計算します！");
		while(remainder>=divisor){
			remainder-=divisor;
			quotient++;
		}
		System.out.println("商は"+quotient+"余りは"+remainder+"です！");
		sc.close();
	}
}