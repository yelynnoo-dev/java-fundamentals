import java.util.Scanner;

public class JKad14C1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, sum = 0;
        while (true) {
            System.out.print("0から100までの整数を入力してください＞");
            n = sc.nextInt();
            if (n < 0) {
                break;
            } else {
                sum += n;
                System.out.println("入力された整数の合計は" + sum + "です！");
            }
        }
    }
}
