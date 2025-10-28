/*
課題名：JKad04A2
作成日：2025/4/24
作成者：YE LYNN OO
*/
import java.util.Scanner;
public class JKad04A2 { 
	public static void main(String[] args) { 
		String normal = "";   
		String reverse = "";   
		String str;  
		Scanner sc=new Scanner(System.in);
		
		System.out.print("文字列1＞");
		str=sc.nextLine();
		normal=normal+str;
		reverse=str+reverse;
		
		System.out.print("文字列2＞");
		str=sc.nextLine();
		normal=normal+str;
		reverse=str+reverse;
		
		System.out.print("文字列3＞");
		str=sc.nextLine();
		normal=normal+str;
		reverse=str+reverse;
		
		System.out.print("文字列4＞");
		str=sc.nextLine();
		normal=normal+str;
		reverse=str+reverse;
		
		System.out.println("入力順："+normal);
		System.out.println("逆 順："+reverse);
	} 
} 