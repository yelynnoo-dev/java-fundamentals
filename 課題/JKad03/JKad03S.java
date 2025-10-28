/*
課題名：JKad03S
作成日：2025/4/22
作成者：YE LYNN OO
*/
public class JKad03S { 
	public static void main(String[] args) { 
		final int COFFEE = 290;	// コーヒーの値段 
		final int DONUT = 270;	// ドーナツの値段 
		final int SALAD = 380;	// サラダの値段
		final int CAKE = 420;	// ケーキの値段 
		int sum=0,tax=0;

		System.out.println("ようこそ！ECC コーヒーへ"); 
		System.out.println("こちらでお召し上がりですね！"); 
		System.out.println("--------"); 
		//各メニューの単価と小計を表示する処理を作成する。 
		System.out.println("コーヒー\t"+COFFEE+"円\t小計："+(sum+=COFFEE)+"円 ");
		System.out.println("ドーナツ\t"+DONUT+"円\t小計："+(sum+=DONUT)+"円 ");
		System.out.println("サラダ\t\t"+SALAD+"円\t小計："+(sum+=SALAD)+"円 ");
		System.out.println("ケーキ\t\t"+CAKE+"円\t小計："+(sum+=CAKE)+"円 ");
		System.out.println("--------"); 
		System.out.println("消費税が"+(tax=sum/10)+"円で支払金額は"+(tax+sum)+"円になります！");
		System.out.println("ありがとうございました！"); 
		//消費税と支払金額（税込み）を計算して表示する。
		
		
		System.out.println("ようこそ！ECC コーヒーへ"); 
		System.out.println("こちらでお召し上がりですね！"); 
		System.out.println("--------"); 
		//各メニューの単価と小計を表示する処理を作成する。 
		int xsum=0,ytax=0;
		System.out.println("コーヒー\t"+COFFEE+"円\t小計："+(xsum+=COFFEE)+"円 ");
		System.out.println("ドーナツ\t"+DONUT+"円\t小計："+(xsum+=DONUT)+"円 ");
		System.out.println("サラダ\t\t"+SALAD+"円\t小計："+(xsum+=SALAD)+"円 ");
		System.out.println("ケーキ\t\t"+CAKE+"円\t小計："+(xsum+=CAKE)+"円 ");
		System.out.println("--------"); 
		System.out.println("消費税が"+(ytax=xsum/8)+"円で支払金額は"+(ytax+xsum)+"円になります！");
		System.out.println("ありがとうございました！"); 
		//消費税と支払金額（税込み）を計算して表示する。
	} 
}