/*
課題名:JKad16A1
作成日:2025/6/19
作成者:YE LYNN OO
*/

public class JKad17C1 {
    public static void main(String[] args) {
        int[] scores = {10, -1, 30, 70, 100};
        int sum = 0, n = 0;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] == -1) {
                continue;
            }
            sum += scores[i];
            n++;
        }
        System.out.println("受験したのは" + n + "人です！");
        System.out.println("平均点は" + (double) sum / n + "点です！");
    }
}
