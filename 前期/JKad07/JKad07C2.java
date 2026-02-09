/*
課題名:JKad07C2
作成日:2025/05/13
作成者:YE LYNN OO
*/
import java.util.Scanner;
public class JKad07C2{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("いくつまでカウントしますか？＞");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++){
			if((i%3)==0){
				System.out.println("Fizz!");
			}else{
				System.out.println(i);
			}
		}
	}
}