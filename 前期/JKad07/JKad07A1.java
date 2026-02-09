/*
‰Û‘è–¼:JKad07A1
ì¬“ú:2025/05/13
ì¬Ò:YE LYNN OO
*/
import java.util.Scanner;
public class JKad07A1{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("9Œ…‚Ü‚Å‚Ì³‚Ì®”‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢„");
		int n=sc.nextInt();
		int count=0;
		boolean found=false;
		while(n>0){
			int digit=n%10;
			if(digit==3){
				count++;
				found=true;
			}
			n/=10;
		}
			
		if(found){
			System.out.println("3‚ğ"+count+"ŒÂŒ©‚Â‚¯‚Ü‚µ‚½I");
		}else{
				System.out.println("3‚ÍŒ©‚Â‚©‚è‚Ü‚¹‚ñ‚Å‚µ‚½I");
		}
	}
}