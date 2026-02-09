/*
課題名:JKad07B1
作成日:2025/05/13
作成者:YE LYNN OO
*/
import java.util.Scanner;
public class JKad07B1{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("年齢を入力してください＞");
		int age=sc.nextInt();
		System.out.print("座席を指定してください（0：S席、0以外：A席）＞");
		int seat=sc.nextInt();
		if(age>=18){
			if(seat==0){
				System.out.println("S席大人料金：2700円になります！");
			}else{
				System.out.println("A席大人料金：1800円になります！");
			}
		}else{
			if(seat==0){
				System.out.println("S席学生料金：1500円になります！");
			}else{
				System.out.println("A席大人料金：1000円になります！");
			}
		}
	}
}