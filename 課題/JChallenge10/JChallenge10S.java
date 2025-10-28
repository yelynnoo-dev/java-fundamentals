/*
課題名:JChallenge10S
作成日:2025/05/22
作成者:YE LYNN OO
*/
import java.util.Scanner;
public class JChallenge10S {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("グループ1の発生周期を入力してください＞");
        int group1 = scanner.nextInt();
        System.out.print("グループ2の発生周期を入力してください＞");
        int group2 = scanner.nextInt();
        System.out.print("グループ3の発生周期を入力してください＞");
        int group3 = scanner.nextInt();
        int a = group1, b = group2;
        while (a != b) {
            if (a > b){
				a = a - b;
            }
            else{
				b = b - a;
            }
        }
        int gcd12 = a;
        int lcm12 = (group1 * group2) / gcd12;
        int x = lcm12, y = group3;
        while (x != y) {
            if (x > y){ 
				x = x - y;
            }
            else{
				y = y - x;
            }
        }
        int gcd123 = x;
        int lcm123 = (lcm12 * group3) / gcd123;
        System.out.println(lcm123 + " 年周期で大量発生します！");
        scanner.close();
    }
}