/*
â€ëËñº:JChallenge08A2
çÏê¨ì˙:2025/05/13
çÏê¨é“:YE LYNN OO
*/
import java.util.Scanner;
public class JChallenge08A2{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Ç¢Ç≠Ç¬çwì¸ÇµÇ‹Ç∑Ç©ÅHÅÑ");
		int n=sc.nextInt();
		if(n>50){
			System.out.println("ë„ã‡ÇÕ"+(n*600)+"â~Ç…Ç»ÇËÇ‹Ç∑ÅI");
		}else if(n>20){
			System.out.println("ë„ã‡ÇÕ"+(n*800)+"â~Ç…Ç»ÇËÇ‹Ç∑ÅI");
		}else{
			System.out.println("ë„ã‡ÇÕ"+(n*1000)+"â~Ç…Ç»ÇËÇ‹Ç∑ÅI");
		}
	}
}