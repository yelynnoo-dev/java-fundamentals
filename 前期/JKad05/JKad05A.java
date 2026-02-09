/*
課題名：JKad05A
作成日：5/1/2025
作成者：YE LYNN OO
*/
import java.util.Scanner;
public class JKad05A{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("のび太の点数を入力してください＞>");
		int n1=sc.nextInt();
		System.out.print("しずかちゃんの点数を入力してください＞");
		int n2=sc.nextInt();
		System.out.print("ジャイアンの点数を入力してください＞");
		int n3=sc.nextInt();
		System.out.print("スネ夫の点数を入力してください＞");
		int n4=sc.nextInt();
		System.out.print("出木杉くんの点数を入力してください＞");
		int n5=sc.nextInt();
		int max=n1;
		if(max<n2){
			max=n2;
		}
		if(max<n3){
			max=n3;
		}
		if(max<n4){
			max=n4;
		}
		if(max<n5){
			max=n5;
		}
		System.out.print("一番高い点数は"+max+"点です！");
	}
}