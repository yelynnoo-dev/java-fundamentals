/*
課題名:JChallenge08X2
作成日:2025/05/22
作成者:YE LYNN OO
*/
import java.util.Scanner;
public class JChallenge08X2{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("あなたの欲しいモノの値段を入力してください＞");
		int n=sc.nextInt();
		if(n==0){
			System.out.print("あなたの欲しいモノの値段は\\0-ですね！");
		}
		else{
			String format="";
			int count=0;
			while(n>0){
				int digit=n%10;
				format=digit+format;
				n/=10;
				count++;
				if((count%3)==0){
					format=","+format;
				}
			}
			System.out.print("あなたの欲しいモノの値段は\\"+format+"-ですね！");
		}
	}
}