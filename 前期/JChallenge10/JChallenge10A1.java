/*
課題名:JChallenge10A1
作成日:2025/05/22
作成者:YE LYNN OO
*/
import java.util.Scanner;
public class JChallenge10A1{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("整数1を入力してください＞");
		int n1=sc.nextInt();
		System.out.print("整数2を入力してください＞");
		int n2=sc.nextInt();
		System.out.print("整数3を入力してください＞");
		int n3=sc.nextInt();
		
		if(n1==n2){
			if(n2==n3){
				System.out.println("すべて同じです！");
			}else{
				System.out.println("整数1と整数2が同じです！");
			}
		}else{
			if(n2==n3){
				System.out.println("整数2と整数3が同じです！");
			}else if(n1==n3){
				System.out.println("整数1と整数3が同じです！");
			}else{
				System.out.println("すべて異なります！");
			}
		}
	}
}