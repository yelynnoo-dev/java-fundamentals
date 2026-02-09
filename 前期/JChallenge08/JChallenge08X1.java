/*
課題名:JChallenge08X1
作成日:2025/05/22
作成者:YE LYNN OO
*/
import java.util.Scanner;
import java.util.Random;
public class JChallenge08X1{
	public static void main(String[] args){
		Random rand=new Random();
		Scanner sc=new Scanner(System.in);
		System.out.print("出場チーム数を入力してください＞");
		int team=sc.nextInt();
		int first=0,second=0,third=0;
		for(int i=1;i<=team;i++){
			int score=rand.nextInt(101);
			System.out.print("第"+i+"チームのスコア："+score);
			if(score>first){
				third=second;
				second=first;
				first=score;
			}else if(score>second){
				third=second;
				second=score;
			}else if(score>third){
				third=score;
			}
			System.out.println("ただいまの順位、1位：" + first + "点、2位："+ second + "点、3位：" + third + "点");
		}
	}
}