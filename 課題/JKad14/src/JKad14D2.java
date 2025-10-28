import java.util.Scanner;

public class JKad14D2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("0以上の整数を入力してください＞");
            n = sc.nextInt();
        } while (n < 0);
        do {
            System.out.println(n % 10);
            n /= 10;
        } while (n > 0);
    }
}
