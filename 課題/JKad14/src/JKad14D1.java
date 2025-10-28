import java.util.Scanner;

public class JKad14D1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("0以上の整数を入力してください＞");
        int n = sc.nextInt();
        do {
            System.out.println(n % 10);
            n /= 10;
        } while (n > 0);
    }
}
