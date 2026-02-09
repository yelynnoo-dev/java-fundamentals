/*
‰Û‘è–¼:JKad06S1
ì¬“ú:2025/05/08
ì¬Ò:YE LYNN OO
*/

public class JKad06S1{
	public static void main(String[] args){
		String result="";
		int i=1;
		while(i<=9){
			int j=1;
			while(j<=9){
				result+=(i*j)+"\t";
				j++;
			}
			result+="\n";
			i++;
		}
		System.out.println(result);
	}
}
