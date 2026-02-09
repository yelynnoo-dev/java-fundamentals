/*
‰Û‘è–¼:JChallenge08A1
ì¬“ú:2025/05/22
ì¬Ò:YE LYNN OO
*/
import java.util.Scanner;
public class JChallenge08A1{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("‚Ğ‚Æ‚Â‚ß‚Ì®”‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢„");
		int n1=sc.nextInt();
		System.out.print("‚Ó‚½‚Â‚ß‚Ì®”‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢„");
		int n2=sc.nextInt();
		int mul1=n1,mul2=n2;
		while(mul1!=mul2){
			if (mul1<mul2){
				mul1+=n1;
			}else {
				mul2+=n2;
			}
		}
		System.out.println("Å‘åŒö–ñ”‚Í "+mul1+"‚Å‚·I");
	}
}