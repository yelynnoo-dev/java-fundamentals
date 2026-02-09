/*
‰Û‘è–¼:JKad07C1
ì¬“ú:2025/05/13
ì¬Ò:YE LYNN OO
*/
import java.util.Scanner;
import java.util.Random;
public class JKad07C1{
	public static void main(String[] args){
		Random rand=new Random();
		Scanner sc=new Scanner(System.in);
		System.out.print("—”‚ğ¶¬‚µ‚Ü‚·I‚¢‚­‚Â¶¬‚µ‚Ü‚·‚©H„");
		int count=sc.nextInt();
		int i=1;
		while(i<=count){
			System.out.print(rand.nextInt(100)+"\t");
			if((i%5)==0){
				System.out.println();
			}
			i++;
		}
	}
}