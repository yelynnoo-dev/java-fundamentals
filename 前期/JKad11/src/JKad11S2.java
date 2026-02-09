import java.util.Scanner;

public class JKad11S2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2;
        do {
            System.out.print("0より大きい整数1を入力してください＞");
            n1 = sc.nextInt();
        } while (n1 <= 0);
        do {
            System.out.print("0より大きい整数2を入力してください＞");
            n2 = sc.nextInt();
        } while (n2 <= 0);
        System.out.println(n1 + "÷" + n2 + "を計算します！");

        double d = (double) n1 / n2;
        System.out.println("double 型で計算" + d);

        int i = n1 / n2;
        int remainder = n1 % n2;
        System.out.print("int 型で計算" + i+".");
        for (int j = 0; j < 40; j++) {
            remainder *= 10;
            int digit = remainder / n2;
            System.out.print(digit);
            remainder = remainder % n2;
        }
    }
}
