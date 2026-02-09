/*
課題名：JKad05C1
作成日：5/1/2025
作成者：YE LYNN OO
*/
import java.util.Random;
public class JKad05C1{
	public static void main(String[] args){
		Random rand= new Random();
		int n=rand.nextInt(10);
		System.out.println("乱数を発生させます！");
		System.out.println(n+"が出ました！");
		if(n%2==0){
			System.out.print("偶数でした！");
		}
		else{
			System.out.println("奇数でした！");
		}
	}
}