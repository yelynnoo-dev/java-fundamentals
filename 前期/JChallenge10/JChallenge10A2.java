/*
課題名:JChallenge10A2
作成日:2025/05/22
作成者:YE LYNN OO
*/
import java.util.Scanner;
public class JChallenge10A2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("グループ1の発生周期を入力してください＞");
        int group1 = scanner.nextInt();
        System.out.print("グループ2の発生周期を入力してください＞");
        int group2 = scanner.nextInt();
        int a = group1, b = group2;
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        int gcd = a; 
        int lcm = (group1 * group2) / gcd;
        System.out.println(lcm + " 年周期で大量発生します！");

        scanner.close();
    }
}
