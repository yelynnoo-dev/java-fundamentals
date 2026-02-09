import java.util.Scanner;

public class JKad12X {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("三角形を作ります！");
        System.out.print("辺1の長さを入力してください＞");
        int a = sc.nextInt();
        System.out.print("辺2の長さを入力してください＞");
        int b = sc.nextInt();
        System.out.print("辺3の長さを入力してください＞");
        int c = sc.nextInt();

        int max = a;
//        int sum = a + b;

        if (b > max) {
            max = b;
//            sum = a + c;
        }
        if (c > max) {
            max = c;
//            sum = a + b;
        }
        int sum = (a + b + c) - max;
        if (max < sum) {
            if (a == b) {
                if (a == c) {
                    System.out.println("正三角形になります！");
                } else {
                    System.out.println("二等辺三角形になります！");
                }
            } else if (b == c) {
                System.out.println("二等辺三角形になります！");
            } else if (a == c) {
                System.out.println("二等辺三角形になります！");
            }
        } else {
            System.out.println("三角形になりません！");
        }
    }
}
