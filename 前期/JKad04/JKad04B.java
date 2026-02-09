/*
課題名：JKad04B
作成日：2025/4/24
作成者：YE LYNN OO
*/
import java.util.Scanner;
public class JKad04B { 
	public static void main(String[] args) { 
		Scanner sc= new Scanner(System.in);
		System.out.print("いくつまで足し合わせますか？");
		int n=sc.nextInt();
		int sum=((n+1)*n)/2;
		/*int sum=0;
		for(int i=1;i<=n;i++){
			sum+=i;
		}*/
	System.out.println("1から10まで足し合わせると・・・"+sum+"になりました！");
	} 
}