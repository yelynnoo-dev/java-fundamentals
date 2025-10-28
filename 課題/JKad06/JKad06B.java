/*
‰Û‘è–¼:JKad06B
ì¬“ú:2025/05/08
ì¬Ò:YE LYNN OO
*/
import java.util.Scanner;
public class JKad06B{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("1‚æ‚è‘å‚«‚¢®”‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢„");
		int n=sc.nextInt();
		int sum=0;
		System.out.println("1‚©‚ç"+n+"‚Ü‚Å‰ÁZ‚µ‚Ü‚·I");
		while(n>0){
			sum+=n;
			n--;
		}
		System.out.println("‡Œv‚Í"+sum+"‚Å‚·");
		sc.close();
	}
}