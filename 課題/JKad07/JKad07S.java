/*
課題名:JKad07S
作成日:2025/05/13
作成者:YE LYNN OO
*/
import java.util.Scanner;
import java.util.Random;
public class JKad07S{
	public static void main(String[] args){
		Random rand=new Random();
		Scanner sc=new Scanner(System.in);
		System.out.println("じゃんけんをします！");
		System.out.print("何の手を出しますか？（0：グー、1：チョキ、2：パー）＞");
		int user=sc.nextInt();
		int com=rand.nextInt(3);
		
		System.out.print("あなたは");
		if(user==0){
			System.out.println("グーを出した！");
		}else if(user==1){
			System.out.println("チョキを出した！");
		}
		else if(user==1){
			System.out.println("パーキを出した！");
		}
		
		System.out.print("コンピュータは");
		if(user==0){
			System.out.println("グーを出した！");
		}else if(user==1){
			System.out.println("チョキを出した！");
		}
		else if(user==1){
			System.out.println("パーキを出した！");
		}
		
		if (user == com) {
            System.out.println("あいこだ！");
        } else {
            if (user == 0) { // User chose グー
                if (com == 1) {
                    System.out.println("あなたの勝ち！");
                } else {
                    System.out.println("あなたの負け！");
                }
            } else {
                if (user == 1) { // User chose チョキ
                    if (com == 2) {
                        System.out.println("あなたの勝ち！");
                    } else {
                        System.out.println("あなたの負け！");
                    }
                } else { // User chose パー
                    if (com == 0) {
                        System.out.println("あなたの勝ち！");
                    } else {
                        System.out.println("あなたの負け！");
                    }
                }
            }
        }

	}
}