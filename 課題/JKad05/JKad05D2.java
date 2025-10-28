/*
課題名：JKad05D2
作成日：5/1/2025
作成者：YE LYNN OO
*/
import java.util.Scanner;
public class JKad05D2{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("こんにちは！\nわたしはスーパーティーチャー、ECCエクセレントよ！\nあなたのクラスを教えてね！（0：IE、1：SK、2：SE）＞");
		int n=sc.nextInt();
		if(n==0){
			System.out.print("4年制コースなのね！");
		}
		else if(n==1){
			System.out.print("3年制コースなのね！ ");
		}
		else if(n==2){
			System.out.print("2年制コースなのね！ ");
		}
	}
}