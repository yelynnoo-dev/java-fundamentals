/*
課題名：JKad05B
作成日：5/1/2025
作成者：YE LYNN OO
*/
import java.util.Random;
import java.util.Scanner;
public class JKad05B{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("2つのサイコロを振ります！");
		System.out.print("出た目の和が偶数か奇数か予想してください（0：偶数、1：奇数）＞");
		int input=sc.nextInt();
		
		Random rand= new Random();
		int n1=rand.nextInt(6)+1;
		int n2=rand.nextInt(6)+1;
		int sum=n1+n2;
		
		System.out.println("ひとつめは"+n1);
		System.out.println("ふたつめは"+n2);
		System.out.println("合わせて"+sum);
		
		if(sum%2==0 ){
			System.out.println("偶数でした！");
			if(input==0){
				System.out.print("あなたの勝ち！");
			}
			else{
				System.out.print("あなたの負け！");
			}
		}
		else{
			System.out.println("奇数でした！");
			if(input==1){
				System.out.print("あなたの勝ち！");
			}
			else{
				System.out.print("あなたの負け！");
			}
		}
	}
}