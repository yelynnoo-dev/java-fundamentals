/*
課題名：JKad05D1
作成日：5/1/2025
作成者：YE LYNN OO
*/
import java.util.Scanner;
public class JKad05D1{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("ひとつめの整数を入力してください>");
		int n1=sc.nextInt();
		System.out.print("ふたつめの整数を入力してください>");
		int n2=sc.nextInt();
		if(n1>n2){
			System.out.print("ふたつの数字で大きい方は"+n1+"です！");
		}
		else{
			System.out.print("ふたつの数字で大きい方は"+n2+"です！");
		}
	}
}