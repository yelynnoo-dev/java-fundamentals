import java.util.Scanner;

public class JKad14A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0, count = 0;
        int score;

        do {
            System.out.print((count + 1) + "人目の点数を入力してください＞");
            score = sc.nextInt();
            if (count == 0 && score < 0) {
                System.out.println("少なくとも1人分は入力してください！");
            } else if (score >= 100) {
                System.out.println("0から100までで入力してください！ ");
            } else if (score >= 0) {
                sum += score;
                count++;
            }
        } while (count == 0 || score >= 0);
        if (count > 0) {
            double average = (double) sum / count;
            System.out.println(count + "人の合計は" + sum + "点です！");
            System.out.println(count + "人の平均は" + average + "点です！");
        }
    }
}
