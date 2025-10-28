/*
‰Û‘è–¼:JChallenge08S2
ì¬“ú:2025/05/22
ì¬ŽÒ:YE LYNN OO
*/
import java.util.Scanner;
public class JChallenge08S2{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("9Œ…‚Ü‚Å‚Ì³‚Ì®”‚ð“ü—Í‚µ‚Ä‚­‚¾‚³‚¢„");
		int n=sc.nextInt();
		while(n>0){
			int digit=n%10;
			for(int i=-0;i<digit;i++){
				System.out.print("*");
			}
			System.out.println();
			n/=10;
		}
	}
}