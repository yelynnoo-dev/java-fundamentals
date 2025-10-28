import java.util.Random;
import java.util.Scanner;

public class JChallenge18A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("生成する整数の桁数を入力してください（1～9）＞");
        int n = sc.nextInt();

        boolean[] used = new boolean[10];
        String ans = "";

        while (ans.length() < n) {
            int digit = rand.nextInt(9) + 1;
            if ((!used[digit])) {
                ans += digit;
                used[digit] = true;
            }
        }
        System.out.println(ans);
    }
}
