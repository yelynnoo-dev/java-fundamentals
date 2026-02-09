/*
課題名：JKad05S
作成日：5/1/2025
作成者：YE LYNN OO
*/
import java.util.Scanner;
import java.util.Random;
public class JKad05S{
	public static void main(String[] args){
		Random rand=new Random();
		Scanner sc=new Scanner(System.in);
		
		System.out.print("こんにちは！");
		System.out.print("わたしは占いマシーンのECC1000よ！ ");
		System.out.print("あなたのことを占ってあげるわ！よろしくね ");
		System.out.print("\n名前は何ていうの？＞");
		String name=sc.nextLine();
		System.out.print("年齢はいくつ？＞");
		int age=sc.nextInt();
		System.out.println(name+" さん、こんにちは！");
		System.out.println("あなたは"+age+"歳なんですね！\n ");
		
		int love=rand.nextInt(101);
		int finance=rand.nextInt(101);
		int overall=rand.nextInt(101);
		
		System.out.println(name+" さんの今日の運勢は ");
		System.out.println(" ラブ運 "+love);
		System.out.println(" 金銭運 "+finance);
		System.out.println(" 全体運 "+overall);
		
		int maxScore=love;
		String maxName=" ラブ運 ";
		if(maxScore<finance){
			maxScore=finance;
			maxName=" 金銭運 ";
		}
		if(maxScore<overall){
			maxScore=overall;
			maxName=" 全体運 ";
		}
		System.out.println("一番高いのは"+maxName+"の"+maxScore);
	}
}