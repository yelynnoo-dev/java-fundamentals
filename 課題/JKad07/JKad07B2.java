/*
‰Û‘è–¼:JKad07B2
ì¬“ú:2025/05/13
ì¬Ò:YE LYNN OO
*/
import java.util.Scanner;
public class JKad07B2{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("‚Ğ‚Æ‚Â‚ß‚Ì®”‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢„");
		int n1=sc.nextInt();
		System.out.print("‚Ó‚½‚Â‚ß‚Ì®”‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢„");
		int n2=sc.nextInt();
		while(n1!=n2){
			if(n1>n2){
				n1-=n2;
			}else{
				n2-=n1;
			}
		
		}
		System.out.println("Å‘åŒö–ñ”‚Í "+n1+"‚Å‚·I");
	}
}