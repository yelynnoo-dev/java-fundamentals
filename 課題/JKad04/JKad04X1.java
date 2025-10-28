/*
課題名：JKad04X1
作成日：2025/4/24
作成者：YE LYNN OO
*/
import java.util.Scanner;
public class JKad04X1 { 
	public static void main(String[] args) { 
		Scanner sc=new Scanner(System.in);
		System.out.print("0から255までの整数を入力してください＞");
		int n=sc.nextInt();
		String binary=Integer.toBinaryString(n);
		for(int i=binary.length();i<8;i++){
			binary="0"+binary;
		}
		/*
		while(binary.length()<8){
		binary="0"+binary;
			}
		*/
		System.out.println(n+" の2進数は " + binary);
	} 
} 