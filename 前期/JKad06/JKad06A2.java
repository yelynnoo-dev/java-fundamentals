/*
‰Û‘è–¼:JKad06A2
ì¬“ú:2025/05/08
ì¬ŽÒ:YE LYNN OO
*/
import java.util.Scanner;
public class JKad06A2{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("9Œ…‚Ü‚Å‚Ì³‚Ì®”‚ð“ü—Í‚µ‚Ä‚­‚¾‚³‚¢„");
		int n=sc.nextInt();
		int value=1;
		while(n>0){
			int digit=n % 10;
			System.out.println(value+"‚ÌˆÊ‚Í"+digit);
			n/=10;
			value*=10;			
		}
		sc.close();
	}
}
