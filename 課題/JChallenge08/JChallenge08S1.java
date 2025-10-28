/*
‰Û‘è–¼:JChallenge08S1
ì¬“ú:2025/05/22
ì¬Ò:YE LYNN OO
*/
import java.util.Scanner;
public class JChallenge08S1{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("9Œ…‚Ü‚Å‚Ì³‚Ì®”‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢„");
		int n=sc.nextInt();
		String binary=Integer.toBinaryString(n);
		System.out.println("2i”‚É•ÏŠ·‚·‚é‚Æ " );
		System.out.println( binary);
		String mark="";
		int count=0;
	
		for(int i=0;i<binary.length();i++){
			if(binary.charAt(i)=='1'){
				mark+="^";
				count++;
			}
			else{
				mark+=" ";
			}
		}
		System.out.println( mark);
		System.out.println("1‚Ì”‚Í " + count+"ŒÂ‚Å‚·I ");
	}
}