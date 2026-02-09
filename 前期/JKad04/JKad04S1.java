/*
課題名：JKad04S1
作成日：2025/4/24
作成者：YE LYNN OO
*/
import java.util.Scanner;
public class JKad04S1 { 
	public static void main(String[] args) { 
		Scanner sc=new Scanner(System.in);
		System.out.print("0から255までの整数を入力してください＞");
		int n=sc.nextInt();
		String binary=Integer.toBinaryString(n);
		
		while(binary.length()<8){
			binary="0"+binary;
		}
		System.out.println("最下位ビットから順に表示します！");
		for(int i=8;i>0;i--){
			System.out.println(binary.charAt(i));
		}
	System.out.println(binary);
	} 
} 