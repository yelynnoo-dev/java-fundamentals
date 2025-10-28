/*
課題名:JKad07D1
作成日:2025/05/13
作成者:YE LYNN OO
*/
import java.util.Random;
public class JKad07D1{
	public static void main(String[] args){
		Random rand=new Random();
		int n=rand.nextInt(100);
		System.out.println("0～99の乱数を発生させます！えいっ！！");
		System.out.println(n+" が出ました！");
		if((n%2)==0){
			System.out.println("2で割り切れます！");
		}
		if((n%)3==0){
			System.out.println("3で割り切れます！");
		}
	}
}